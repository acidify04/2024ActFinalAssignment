document.querySelectorAll('.toggleButton').forEach(button => {
    button.addEventListener('click', function() {
        var details = this.nextElementSibling;
        if (details.classList.contains('hidden')) {
            details.classList.remove('hidden');
            details.style.display = 'block';
            // this.textContent = 'Hide Details';
        } else {
            details.classList.add('hidden');
            details.style.display = 'none';
            // this.textContent = 'Show Details';
        }
    });
});
