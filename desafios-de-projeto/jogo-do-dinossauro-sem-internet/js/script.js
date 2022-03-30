//Começa Jogo
function jogar() {
  let planeta = document.querySelector('.planeta');
  let background = document.querySelector('.background');
  let pontuacao = 0;
  planeta.style.cssText = 'display: inline;';
  background.style.cssText = 'display: inline;';

  let isJumping = false;
  let isGameOver = false;
  let position = 0;

  function handleKeyUp(event) {
    if (event.keyCode === 38) {
      if (!isJumping) {
        jump();
      }
    }
  }

  function jump() {
    isJumping = true;

    let upInterval = setInterval(() => {
      if (position >= 150) {
        clearInterval(upInterval);

        let downInterval = setInterval(() => {
          if (position <= 0) {
            clearInterval(downInterval);
            isJumping = false;
          } else {
            position -= 20;
            planeta.style.bottom = position + 'px';
          }
        }, 20);
      } else {
        position += 20;
        planeta.style.bottom = position + 'px';
      }
    }, 20);
  }

  function createVirus() {
    const virus = document.createElement('div');
    let virusPosition = 1000;
    let randomTime = Math.random() * 6000;

    if (isGameOver) return;

    virus.classList.add('virus');
    background.appendChild(virus);
    virus.style.left = virusPosition + 'px';

    let leftTimer = setInterval(() => {
      if (virusPosition < -60) {
        clearInterval(leftTimer);
        background.removeChild(virus);
        pontuacao++;
      } else if (virusPosition > 0 && virusPosition < 60 && position < 60) {
        clearInterval(leftTimer);
        isGameOver = true;
        document.body.innerHTML = '<h1 class="game-over">Fim de jogo! O Planeta Terra foi Contaminado! 😢<br>' + ' Pontuação Total: ' + pontuacao + '  <br> Mas na Vida Real Você ainda Pode Derrotar a COVID-19!</h1><p><img  src="./img/vacine-se.jpg" alt="Vacine-se e derrote a Covid-19!" /></p><h2 class="jogar-novamente">Deseja Jogar Novamente? <a href onClick="window.location.reload();">Clique Aqui!</a></h2>';
      } else {
        pontuacao++;
        virusPosition -= 10;
        virus.style.left = virusPosition + 'px';
      }
    }, 20);

    setTimeout(createVirus, randomTime);
  }
  createVirus();
  document.addEventListener('keyup', handleKeyUp);

}
