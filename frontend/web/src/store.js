import Vuex from 'vuex'
import Vue from 'vue'
import axios from "axios";

Vue.use(Vuex)

export default new Vuex.Store({
    state: {
        books: [],
    },
    getters: {
        books(state) {
            return state.books;
        },
    },
    mutations: {
        books(state, books) {
            state.books = books;
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
    },
});
