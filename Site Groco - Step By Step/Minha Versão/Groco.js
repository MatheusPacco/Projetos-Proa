window.onload = () =>{
    document.getElementById('menu-btn').addEventListener('click', () => {
        document.querySelector('.pesquisa-modal').classList.remove('ativo')
        document.querySelector('#carrinho-modal').classList.remove('ativo-carrinho')
        document.querySelector('#Login-modal').classList.remove('ativo-login')
        document.querySelector('.navbar').classList.toggle('show')
    })

    document.getElementById('pequisa-btn').addEventListener('click', () => {
        document.querySelector('.pesquisa-modal').classList.toggle('ativo')
        document.querySelector('#Login-modal').classList.remove('ativo-login')
        document.querySelector('#carrinho-modal').classList.remove('ativo-carrinho')
        document.querySelector('.navbar').classList.remove('show')
    })

    document.getElementById('compra-btn').addEventListener('click', () => {
        document.querySelector('.pesquisa-modal').classList.remove('ativo')
        document.querySelector('.navbar').classList.remove('show')
        document.querySelector('#Login-modal').classList.remove('ativo-login')
        document.querySelector('#carrinho-modal').classList.toggle('ativo-carrinho')
    })

    document.getElementById('login-btn').addEventListener('click', () => {
        document.querySelector('.pesquisa-modal').classList.remove('ativo')
        document.querySelector('.navbar').classList.remove('show')
        document.querySelector('#carrinho-modal').classList.remove('ativo-carrinho')
        document.querySelector('#Login-modal').classList.toggle('ativo-login')
    })
    
    var swiper = new Swiper(".product-slider", {
        loop:true,
        spaceBetween: 20,
        autoplay: {
            delay: 7500,
            disableOnInteraction: false,
        },
        centeredSlides: true,
        breakpoints: {
        0: {
            slidesPerView: 1,
        },
        768: {
            slidesPerView: 2,
        },
        1020: {
            slidesPerView: 3,
        },
        },
    });

    var swiper = new Swiper(".review-slider", {
        loop:true,
        spaceBetween: 20,
        autoplay: {
            delay: 7500,
            disableOnInteraction: false,
        },
        centeredSlides: true,
        breakpoints: {
        0: {
            slidesPerView: 1,
        },
        768: {
            slidesPerView: 2,
        },
        1020: {
            slidesPerView: 3,
        },
        },
    });
}