<template>
    <div>

        <div class="card border-primary">
            <div class="card-header text-white bg-primary">
                本一覧
            </div>
            <div class="card-body">
                <b-table striped hover :items="books" :fields="bookFields">
                    <template slot="delete-button" slot-scope="row">
                        <b-button size="sm" variant="danger" @click="deleteBook(row.item)" >
                        delete
                        </b-button>
                    </template>
                </b-table>
            </div>
        </div>

        <div class="card border-primary">
            <div class="card-header text-white bg-primary">
                本の追加
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
                        <label for="author">作者</label>
                        <input type="text" class="form-control"
                            v-model="author" placeholder="作者" id="author">
                    </div>
                </div>
                <button class="btn btn-primary" @click='addBook'>
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
        computed: mapGetters(['books']),
        data() {
            return {
                title: '',
                author: '',
                showAlert: false,
                alertMessage: '',
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
                    },
                    {
                      key: 'delete-button',
                      label: '削除',
                      sortable: false,
                    }
                ],
            }
        },
        mounted() {
            this.$store.dispatch("getBooks");
        },
        methods: {
            addBook () {
                this.$store.dispatch('addBook', {
                    title: this.title,
                    author: this.author,
                    successCb: res => {
                        this.$router.push('/book');
                        this.title = '';
                        this.author = '';
                        this.$store.dispatch("getBooks");
                    },
                    errorCb: error => {
                        this.showAlert = true;
                        this.alertMessage = 'Add Book Failed';
                    }
                 });
            },
            deleteBook (book) {
                var _this = this;
                this.$swal({
                    title: '本当にいいですか',
                    text: '[ ID : ' + book.id + ' ] を削除します',
                    type: 'warning',
                    showCancelButton: true,
                    confirmButtonColor: '#DD6B55',
                    confirmButtonText: '削除',
                    closeOnConfirm: false,
                }).then(function() {
                    _this.$store.dispatch('deleteBook', {
                        id: book.id,
                        successCb: res => {
                            _this.$router.push('/book');
                            _this.$store.dispatch("getBooks");
                            _this.$swal({
                                title: '削除しました!',
                                text: '[ ID : ' + book.id + ' ] を削除しました',
                                type: 'success'
                            });
                        },
                        errorCb: error => {
                            _this.showAlert = true;
                            _this.alertMessage = 'Delete Book Failed';
                        }
                    });
                });
            },
        }
    }
</script>
