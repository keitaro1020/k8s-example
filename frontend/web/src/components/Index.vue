<template>
    <div>

        <div class="card border-primary">
            <div class="card-header text-white bg-primary">
                本棚一覧
            </div>
            <div class="card-body">
                <b-table striped hover :items="bookshelfs" :fields="bookShelfFields">
                    <template slot="show_details" slot-scope="row">
                        <b-button size="sm" @click.stop="row.toggleDetails" class="mr-2">
                        {{ row.detailsShowing ? 'Hide' : 'Show'}}
                        </b-button>
                    </template>
                    <template slot="row-details" slot-scope="row">
                        <b-card>
                            <b-table striped hover :items="row.item.books" :fields="bookFields"></b-table>
                            <select v-model="selected[row.item.id]">
                              <option v-for="book in books" v-bind:value="book.id">
                                {{ book.title }} |  {{ book.author }}
                              </option>
                            </select>
                            <b-button size="sm" variant="danger" @click="addBookToBookShelf(row.item.id, selected[row.item.id])" >
                                add
                            </b-button>
                        </b-card>
                    </template>
                    <template slot="delete-button" slot-scope="row">
                        <b-button size="sm" variant="danger" @click="deleteBookShelf(row.item)" >
                        delete
                        </b-button>
                    </template>
                </b-table>
            </div>
        </div>

        <div class="card border-primary">
            <div class="card-header text-white bg-primary">
                本棚の追加
            </div>
            <div class="card-body">
                <div class="form-group">
                    <div class="alert alert-danger" role="alert" v-if="showAlert">
                        {{ alertMessage }}
                    </div>
                    <div class="form-group">
                        <label for="title">タイトル</label>
                        <input type="text" class="form-control"
                            v-model="title" placeholder="タイトル" id="title">
                    </div>
                    <div class="form-group">
                        <label for="description">説明</label>
                        <input type="text" class="form-control"
                            v-model="description" placeholder="説明" id="description">
                    </div>
                </div>
                <button class="btn btn-primary" @click='addBookShelf'>
                    追加
                </button>
            </div>
        </div>
    </div>
</template>

<style>
div.card {
    margin-top: 20px;
}
</style>

<script>
    import {mapGetters} from 'vuex'
    import store from '../store'
    import Vue from 'vue'
    import VueSweetAlert from 'vue-sweetalert'

    Vue.use(VueSweetAlert)

    export default {
        computed: mapGetters(['bookshelfs','books']),
        data() {
            return {
                title: '',
                description: '',
                showAlert: false,
                alertMessage: '',
                selected: {},
                bookShelfFields: [
                    {
                      key: 'id',
                      sortable: true
                    },
                    {
                      key: 'title',
                      label: 'タイトル',
                      sortable: true
                    },
                    {
                      key: 'description',
                      label: '説明',
                      sortable: true,
                    },
                    {
                      key: 'show_details',
                      label: '詳細',
                      sortable: true,
                    },
                    {
                      key: 'delete-button',
                      label: '削除',
                      sortable: false,
                    }
                ],
                bookFields: [
                    {
                      key: 'id',
                      sortable: true
                    },
                    {
                      key: 'title',
                      label: 'タイトル',
                      sortable: true
                    },
                    {
                      key: 'author',
                      label: '作者',
                      sortable: true,
                    }
                ],
            }
        },
        mounted() {
            this.$store.dispatch("getBookShelfs");
            this.$store.dispatch("getBooks");
        },
        methods: {
            addBookShelf () {
                this.$store.dispatch('addBookShelf', {
                    title: this.title,
                    description : this.description,
                    successCb: res => {
                        this.$router.push('/');
                        this.title = '';
                        this.description = '';
                        this.$store.dispatch("getBookShelfs");
                    },
                    errorCb: error => {
                        this.showAlert = true;
                        this.alertMessage = 'Add BookShelf Failed';
                    }
                 });
            },
            addBookToBookShelf (shelfId, bookId) {
                if(bookId) {
                    this.$store.dispatch('addBookShelfBook', {
                        id: shelfId,
                        bookId : bookId,
                        successCb: res => {
                            this.$store.dispatch("getBookShelfs");
                        },
                        errorCb: error => {
                            this.showAlert = true;
                            this.alertMessage = 'Add BookShelf Failed';
                        }
                     });
                }
            },
            deleteBookShelf (bookShelf) {
                var _this = this;
                this.$swal({
                    title: '本当にいいですか',
                    text: '[ ID : ' + bookShelf.id + ' ] を削除します',
                    type: 'warning',
                    showCancelButton: true,
                    confirmButtonColor: '#DD6B55',
                    confirmButtonText: '削除',
                }).then(function() {
                    _this.$store.dispatch('deleteBookShelf', {
                        id: bookShelf.id,
                        successCb: res => {
                            _this.$router.push('/');
                            _this.$store.dispatch("getBookShelfs");
                            _this.$swal({
                                title: '削除しました!',
                                text: '[ ID : ' + bookShelf.id + ' ] を削除しました',
                                type: 'success'
                            });
                        },
                        errorCb: error => {
                            _this.showAlert = true;
                            _this.alertMessage = 'Delete BookShelf Failed';
                        }
                    });
                });
            },
        }

    }
</script>
