<script>
    const btn = document.getElementById('mobile-menu-btn');
    const menu = document.getElementById('mobile-menu');

    // Menghapus class hidden bawaan tailwind agar digantikan logic CSS transition
    menu.classList.remove('hidden');

    btn.addEventListener('click', () => {
        menu.classList.toggle('active');
    });
    
    // Menutup menu ketika link diklik
    const links = menu.querySelectorAll('a');
    links.forEach(link => {
        link.addEventListener('click', () => {
            menu.classList.remove('active');
        });
    });
</script>