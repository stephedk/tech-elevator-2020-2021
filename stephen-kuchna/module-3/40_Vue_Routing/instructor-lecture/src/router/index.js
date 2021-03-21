import Vue from 'vue'
import VueRouter from 'vue-router'
import Products from '@/views/Products.vue'
import ProductDetails from '@/views/ProductDetails.vue'
import AddReview from '@/views/AddReview.vue'
import AboutUs from '@/views/AboutUs.vue'
import ContactUs from '@/views/ContactUs.vue'

Vue.use(VueRouter)

const routes = [
  {
    path: '/',
    name: 'products',
    component: Products
  },
  {
    path: '/products/:id',
    name: 'product-details',
    component: ProductDetails
  },
  {
    path: '/products/:id/add-review',
    name: 'add-review',
    component: AddReview
  },
  {
    path: '/about',
    name: 'about-us',
    component: AboutUs
  },
  {
    path: '/contact',
    name: 'contact-us',
    component: ContactUs
  },

]

const router = new VueRouter({
  mode: 'history',
  base: process.env.BASE_URL,
  routes
})

export default router
