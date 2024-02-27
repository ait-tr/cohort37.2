const menuItems = [
    { title: 'Главная', link: "/home" },
    { title: 'Магазин', link: "/shop" },
    { title: 'О нас', link: "/about" },
    { title: 'Новости', link: "/news" },
    { title: 'Контакты', link: "/contact" },
    { title: 'Личный кабинет', link: "/account" },
  ];

  const navigation = document.querySelector('.navigation');

  const menuHtml = menuItems.map(item => 
    `<a href="${item.link}" class="nav-item">${item.title}</a>`).join('');

  navigation.innerHTML += menuHtml; 