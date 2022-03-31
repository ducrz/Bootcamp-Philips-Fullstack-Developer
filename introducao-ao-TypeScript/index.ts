const input = document.getElementById('input') as HTMLInputElement;

input.addEventListener('input', (event) => {
    //console.log("Digitação");

    const i = event.currentTarget as HTMLInputElement;
    console.log(i.value);
});
