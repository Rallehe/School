import { createRouter, createWebHistory } from 'vue-router'
import HomeView from '../views/HomeView.vue'
import FightView from '../views/FightView.vue'
import GearView from '../views/GearView.vue'

/**
 * Simple router to all the different pages with web history.
 */
const router = createRouter({
  history: createWebHistory(import.meta.env.BASE_URL),
  routes: [
    {
      path: '/',
      name: 'home',
      component: HomeView
    },
    {
      path: '/fight',
      name: 'fight',
      component: FightView
    },
    {
     path: '/gear',
     name: 'gear',
     component: GearView
    },
  ]
})
/**
 * This makes sure that .modal-backdrop and tts stops if you use "Go back one page" instead of using the close button
 */
router.beforeEach((to, from, next) => {
 $(".modal-backdrop").remove();
 $(window.speechSynthesis.cancel())
 next();
});

export default router