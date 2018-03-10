import Vuex from 'vuex'
import Vue from 'vue'
import axios from "axios";

Vue.use(Vuex)

export default new Vuex.Store({
    state: {
        books: [],
        bookshelfs: [],
    },
    getters: {
        books(state) {
            return state.books;
        },
        bookshelfs(state) {
            return state.bookshelfs;
        },
    },
    mutations: {
        books(state, books) {
            state.books = books;
        },
        bookshelfs(state, bookshelfs) {
            state.bookshelfs = bookshelfs;
        },
    },
    actions: {
        getBooks(context) {
            axios.get('/api/books')
                .then(function (response) {
                    context.commit('books', response.data);
                });
        },
        addBook (context, {title, author, successCb, errorCb}) {
            axios.post('/api/books', {title: title, author: author})
                .then(function (response) {
                    successCb();
                })
                .catch(function(reason) {
                    errorCb();
                });
        },
        deleteBook (context, {id, successCb, errorCb}) {
            axios.delete('/api/books/' + id)
                .then(function (response) {
                    successCb();
                })
                .catch(function(reason) {
                    errorCb();
                });
        },
        getBookShelfs(context) {
            axios.get('/api/bookshelfs')
                .then(function (response) {
                    context.commit('bookshelfs', response.data);
                });
        },
        addBookShelf (context, {title, description, successCb, errorCb}) {
            axios.post('/api/bookshelfs', {title: title, description: description})
                .then(function (response) {
                    successCb();
                })
                .catch(function(reason) {
                    errorCb();
                });
        },
        deleteBookShelf (context, {id, successCb, errorCb}) {
            axios.delete('/api/bookshelfs/' + id)
                .then(function (response) {
                    successCb();
                })
                .catch(function(reason) {
                    errorCb();
                });
        },
        addBookShelfBook (context, {id, bookId, successCb, errorCb}) {
            axios.post('/api/bookshelfs/' + id + '/books/' + bookId)
                .then(function (response) {
                    successCb();
                })
                .catch(function(reason) {
                    errorCb();
                });
        },
    },
});
