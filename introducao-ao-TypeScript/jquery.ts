import $ from "jquery";

$.fn.extend({
    novaFuncao() {
        console.log("Chamou Nova Função");
    }
});

$('body').novaFuncao();