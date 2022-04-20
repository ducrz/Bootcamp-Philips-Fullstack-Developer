package com.dio;

import com.dio.dominio.Bootcamp;
import com.dio.dominio.Curso;
import com.dio.dominio.Dev;
import com.dio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Curso curso1 = new Curso();

        int contCursos = 0;
        int contMentorias =0;

        curso1.setTitulo("Boas-vindas ao Bootcamp Philips Fullstack Developer | You Are You");
        curso1.setDescricao("Boas-vindas ao Bootcamp Philips Fullstack Developer | You are you");
        curso1.setCargaHoraria(1);
        contCursos++;

        Curso curso2 = new Curso();
        curso2.setTitulo("Lógica de Programação Essencial");
        curso2.setDescricao("Entendendo o que é lógica");
        curso2.setCargaHoraria(4);
        contCursos++;

        Curso curso3 = new Curso();
        curso3.setTitulo("Pensamento Computacional");
        curso3.setDescricao("Apresentação do curso");
        curso3.setCargaHoraria(2);
        contCursos++;

        Curso curso4 = new Curso();
        curso4.setTitulo("Introdução ao Git e ao GitHub");
        curso4.setDescricao("Entendendo o que é Git e sua importância");
        curso4.setCargaHoraria(5);
        contCursos++;

        Curso curso5 = new Curso();
        curso5.setTitulo("Criando seu Primeiro Repositório no GitHub Para Compartilhar Seu Progresso");
        curso5.setDescricao("Criando seu Primeiro Repositório no GitHub Para Compartilhar Seu Progresso");
        curso5.setCargaHoraria(5);
        contCursos++;


        Curso curso6 = new Curso();
        curso6.setTitulo("Introdução a criação de websites com HTML5 e CSS3");
        curso6.setDescricao("Estrutura Básica");
        curso6.setCargaHoraria(6);
        contCursos++;

        Curso curso7 = new Curso();
        curso7.setTitulo("Construindo páginas para internet com Bootstrap");
        curso7.setDescricao("Aprenda sobre o framework Bootstrap");
        curso7.setCargaHoraria(4);
        contCursos++;

        Curso curso8 = new Curso();
        curso8.setTitulo("Posicionando elementos com Flexbox em CSS");
        curso8.setDescricao("Apresentação do curso");
        curso8.setCargaHoraria(4);
        contCursos++;

        Curso curso9 = new Curso();
        curso9.setTitulo("Sintaxe Básica em JavaScript");
        curso9.setDescricao("Apresentação do curso");
        curso9.setCargaHoraria(2);
        contCursos++;

        Curso curso10 = new Curso();
        curso10.setTitulo("Sintaxe e Operadores");
        curso10.setDescricao("Apresentação do curso");
        curso10.setCargaHoraria(2);
        contCursos++;

        Curso curso11 = new Curso();
        curso11.setTitulo("Variáveis e Tipos");
        curso11.setDescricao("Apresentação do curso");
        curso11.setCargaHoraria(3);
        contCursos++;

        Curso curso12 = new Curso();
        curso12.setTitulo("Trabalhando com Módulos em Javascript");
        curso12.setDescricao("Apresentação do curso");
        curso12.setCargaHoraria(1);
        contCursos++;

        Curso curso13 = new Curso();
        curso13.setTitulo("Funções");
        curso13.setDescricao("Apresentação do curso");
        curso13.setCargaHoraria(1);
        contCursos++;

        Curso curso14 = new Curso();
        curso14.setTitulo("Coleções");
        curso14.setDescricao("Apresentação do curso");
        curso14.setCargaHoraria(1);
        contCursos++;

        Curso curso15 = new Curso();
        curso15.setTitulo("Debugging e Error Handling");
        curso15.setDescricao("Apresentação do curso");
        curso15.setCargaHoraria(2);
        contCursos++;

        Curso curso16 = new Curso();
        curso16.setTitulo("Orientações a Objetos");
        curso16.setDescricao("Apresentação do curso");
        curso16.setCargaHoraria(1);
        contCursos++;

        Curso curso17 = new Curso();
        curso17.setTitulo("Javascript Assíncrono");
        curso17.setDescricao("Apresentação do curso");
        curso17.setCargaHoraria(1);
        contCursos++;

        Curso curso18 = new Curso();
        curso18.setTitulo("Introdução ao TypeScript: Explorando Classes, Tipos e Interfaces");
        curso18.setDescricao("Exemplo das vantagens do typescript");
        curso18.setCargaHoraria(2);
        contCursos++;


        Curso curso19 = new Curso();
        curso19.setTitulo("Introdução ao Angular 8");
        curso19.setDescricao("O que veremos na aula");
        curso19.setCargaHoraria(5);
        contCursos++;


        Curso curso20 = new Curso();
        curso20.setTitulo("A arquitetura de componentes e a gestão da complexidade no front-end");
        curso20.setDescricao("Apresentação inicial");
        curso20.setCargaHoraria(2);
        contCursos++;

        Curso curso21 = new Curso();
        curso21.setTitulo("Explorando Diretivas com Angular");
        curso21.setDescricao("Apresentação inicial e objetivos do conteúdo");
        curso21.setCargaHoraria(2);
        contCursos++;

        Curso curso22 = new Curso();
        curso22.setTitulo("Trabalhando com Páginas SPA com Angular");
        curso22.setDescricao("Desafio Angular");
        curso22.setCargaHoraria(2);
        contCursos++;


        Curso curso23 = new Curso();
        curso23.setTitulo("Implementando Serviços e Injeção de Dependências com Angular");
        curso23.setDescricao("Apresentação inicial e objetivos do curso");
        curso23.setCargaHoraria(2);
        contCursos++;

        Curso curso24 = new Curso();
        curso24.setTitulo("Introdução a Serviços Assíncronos no Angular");
        curso24.setDescricao("Apresentação inicial");
        curso24.setCargaHoraria(3);
        contCursos++;


        Curso curso25 = new Curso();
        curso25.setTitulo("O Poder do Data Binding no Angular");
        curso25.setDescricao("Apresentação inicial");
        curso25.setCargaHoraria(2);
        contCursos++;

        Curso curso26 = new Curso();
        curso26.setTitulo("Trabalhando com Componentes em Angular");
        curso26.setDescricao("Apresentação inicial");
        curso26.setCargaHoraria(2);
        contCursos++;

        Curso curso27 = new Curso();
        curso27.setTitulo("Criação de Pipes com Angular");
        curso27.setDescricao("Apresentação inicial");
        curso27.setCargaHoraria(2);
        contCursos++;

        Curso curso28 = new Curso();
        curso28.setTitulo("SQL SERVER - Criando suas primeiras consultas");
        curso28.setDescricao("O que é SQL Server");
        curso28.setCargaHoraria(4);
        contCursos++;

        Curso curso29 = new Curso();
        curso29.setTitulo("Modelando um banco de dados na prática com SQL SERVER");
        curso29.setDescricao("Apresentação do tema, da API e a organização das tabelas");
        curso29.setCargaHoraria(2);
        contCursos++;

        Curso curso30 = new Curso();
        curso30.setTitulo("SQL Server: Boas práticas em bancos relacionais");
        curso30.setDescricao("Apresentação e objetivos do curso");
        curso30.setCargaHoraria(2);
        contCursos++;

        Curso curso31 = new Curso();
        curso31.setTitulo("Dominando IDEs Java");
        curso31.setDescricao("Apresentação do curso");
        curso31.setCargaHoraria(4);
        contCursos++;

        Curso curso32 = new Curso();
        curso32.setTitulo("Introdução ao Ecossistema e Documentação Java");
        curso32.setDescricao("Apresentação do curso");
        curso32.setCargaHoraria(2);
        contCursos++;

        Curso curso33 = new Curso();
        curso33.setTitulo("Introdução ao Ecossistema e Documentação Java");
        curso33.setDescricao("Apresentação do curso");
        curso33.setCargaHoraria(2);
        contCursos++;

        Curso curso34 = new Curso();
        curso34.setTitulo("Configurando Ambiente de Desenvolvimento Java no Linux");
        curso34.setDescricao("Apresentação do curso e Entendendo a JVM");
        curso34.setCargaHoraria(1);
        contCursos++;

        Curso curso35 = new Curso();
        curso35.setTitulo("Resolvendo Desafios de Código em Java");
        curso35.setDescricao("Boas-vindas e Introdução");
        curso35.setCargaHoraria(1);
        contCursos++;

        Curso curso36 = new Curso();
        curso36.setTitulo("Variáveis, Tipos de Dados e Operadores Matemáticos em Java");
        curso36.setDescricao("Introdução");
        curso36.setCargaHoraria(2);
        contCursos++;

        Curso curso37 = new Curso();
        curso37.setTitulo("Variáveis, Tipos de Dados e Operadores Matemáticos em Java");
        curso37.setDescricao("Introdução");
        curso37.setCargaHoraria(2);
        contCursos++;

        Curso curso38 = new Curso();
        curso38.setTitulo("Entendendo Métodos Java");
        curso38.setDescricao("Introdução ao Curso");
        curso38.setCargaHoraria(2);
        contCursos++;

        Curso curso39 = new Curso();
        curso39.setTitulo("Lógica Condicional e Controle de Fluxos em Java");
        curso39.setDescricao("Apresentação do curso");
        curso39.setCargaHoraria(1);
        contCursos++;

        Curso curso40 = new Curso();
        curso40.setTitulo("Estruturas de Repetição e Arrays em Java");
        curso40.setDescricao("Apresentação");
        curso40.setCargaHoraria(3);
        contCursos++;

        Curso curso41 = new Curso();
        curso41.setTitulo("Praticando Orientação a Objetos com Java");
        curso41.setDescricao("Apresentação inicial");
        curso41.setCargaHoraria(2);
        contCursos++;

        Curso curso42 = new Curso();
        curso42.setTitulo("Debugging Java");
        curso42.setDescricao("Apresentação e Visão Geral");
        curso42.setCargaHoraria(1);
        contCursos++;

        Curso curso43 = new Curso();
        curso43.setTitulo("Tratamento de Exceções em Java");
        curso43.setDescricao("Apresentação");
        curso43.setCargaHoraria(2);
        contCursos++;

        Curso curso44 = new Curso();
        curso44.setTitulo("Introdução ao Spring Framework");
        curso44.setDescricao("Introdução ao curso");
        curso44.setCargaHoraria(3);
        contCursos++;

        Curso curso45 = new Curso();
        curso45.setTitulo("Introdução ao Framework Spring Boot");
        curso45.setDescricao("O que é e quais problemas resolvem o Spring Boot?");
        curso45.setCargaHoraria(2);
        contCursos++;

        Curso curso46 = new Curso();
        curso46.setTitulo("Simplificando Projetos Java com o Spring Boot");
        curso46.setDescricao("Introdução e Apresentação do Curso");
        curso46.setCargaHoraria(3);
        contCursos++;

        Curso curso47 = new Curso();
        curso47.setTitulo("Imersão no Spring Framework com Spring Boot");
        curso47.setDescricao("Abertura");
        curso47.setCargaHoraria(3);
        contCursos++;


        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Philips Fullstack Developer");
        bootcamp.setDescricao("You Are You");

        // Adicionando todos os cursos
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(curso3);
        bootcamp.getConteudos().add(curso4);
        bootcamp.getConteudos().add(curso5);
        bootcamp.getConteudos().add(curso6);
        bootcamp.getConteudos().add(curso7);
        bootcamp.getConteudos().add(curso8);
        bootcamp.getConteudos().add(curso9);
        bootcamp.getConteudos().add(curso10);
        bootcamp.getConteudos().add(curso11);
        bootcamp.getConteudos().add(curso12);
        bootcamp.getConteudos().add(curso13);
        bootcamp.getConteudos().add(curso14);
        bootcamp.getConteudos().add(curso15);
        bootcamp.getConteudos().add(curso16);
        bootcamp.getConteudos().add(curso17);
        bootcamp.getConteudos().add(curso18);
        bootcamp.getConteudos().add(curso19);
        bootcamp.getConteudos().add(curso20);
        bootcamp.getConteudos().add(curso21);
        bootcamp.getConteudos().add(curso22);
        bootcamp.getConteudos().add(curso23);
        bootcamp.getConteudos().add(curso24);
        bootcamp.getConteudos().add(curso25);
        bootcamp.getConteudos().add(curso26);
        bootcamp.getConteudos().add(curso27);
        bootcamp.getConteudos().add(curso28);
        bootcamp.getConteudos().add(curso29);
        bootcamp.getConteudos().add(curso30);
        bootcamp.getConteudos().add(curso31);
        bootcamp.getConteudos().add(curso32);
        bootcamp.getConteudos().add(curso33);
        bootcamp.getConteudos().add(curso34);
        bootcamp.getConteudos().add(curso35);
        bootcamp.getConteudos().add(curso36);
        bootcamp.getConteudos().add(curso37);
        bootcamp.getConteudos().add(curso38);
        bootcamp.getConteudos().add(curso39);
        bootcamp.getConteudos().add(curso40);
        bootcamp.getConteudos().add(curso41);
        bootcamp.getConteudos().add(curso42);
        bootcamp.getConteudos().add(curso43);
        bootcamp.getConteudos().add(curso44);
        bootcamp.getConteudos().add(curso45);
        bootcamp.getConteudos().add(curso46);
        bootcamp.getConteudos().add(curso47);


        //Adicionando todas as mentorias

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("Mentoria #1: Aula Inaugural - Philips Fullstack Developer | You Are Your");
        mentoria1.setDescricao("Mentoria #1: Aula Inaugural - Philips Fullstack Developer | You Are You");
        mentoria1.setData(LocalDate.of(2022,03, 17));
        contMentorias++;

        Mentoria mentoria2 = new Mentoria();
        mentoria2.setTitulo("Mentoria #2: Apresentação dos Projetos de Tecnologia da Philips");
        mentoria2.setDescricao("Mentoria #2: Apresentação dos Projetos de Tecnologia da Philips");
        mentoria2.setData(LocalDate.of(2022,03, 23));
        contMentorias++;

        Mentoria mentoria3 = new Mentoria();
        mentoria3.setTitulo("Mentoria #3: Como Resolver os Desafios de Código");
        mentoria3.setDescricao("Mentoria #3: Como Resolver os Desafios de Código");
        mentoria3.setData(LocalDate.of(2022,03, 30));
        contMentorias++;

        Mentoria mentoria4 = new Mentoria();
        mentoria4.setTitulo("Mentoria #4: Banco de Dados ORACLE");
        mentoria4.setDescricao("Mentoria #4: Banco de Dados ORACLE");
        mentoria4.setData(LocalDate.of(2022,04, 26));
        contMentorias++;

        Mentoria mentoria5 = new Mentoria();
        mentoria5.setTitulo("Mentoria #5: Abstraindo Situações do Mundo Real com Orientação a Objetos");
        mentoria5.setDescricao("Mentoria #5: Abstraindo Situações do Mundo Real com Orientação a Objetos");
        mentoria5.setData(LocalDate.of(2022,04, 12));
        contMentorias++;

        Mentoria mentoria6 = new Mentoria();
        mentoria6.setTitulo("Mentoria #6: Definição do Ambiente e Introdução ao PLSQL");
        mentoria6.setDescricao("Mentoria #6: Definição do Ambiente e Introdução ao PLSQL");
        mentoria6.setData(LocalDate.of(2022,04, 25));
        contMentorias++;

        Mentoria mentoria7 = new Mentoria();
        mentoria7.setTitulo("Mentoria #7: Procedures e Funções, estruturas de repetição e tratamento de exceções");
        mentoria7.setDescricao("Mentoria #7: Procedures e Funções, estruturas de repetição e tratamento de exceções");
        mentoria7.setData(LocalDate.of(2022,04, 28));
        contMentorias++;

        Mentoria mentoria8 = new Mentoria();
        mentoria8.setTitulo("Mentoria #8: Como se tornar um Desenvolvedor de Sucesso na Philips");
        mentoria8.setDescricao("Mentoria #8: Como se tornar um Desenvolvedor de Sucesso na Philips");
        mentoria8.setData(LocalDate.of(2022,05, 10));
        contMentorias++;

        bootcamp.getConteudos().add(mentoria1);
        bootcamp.getConteudos().add(mentoria2);
        bootcamp.getConteudos().add(mentoria3);
        bootcamp.getConteudos().add(mentoria4);
        bootcamp.getConteudos().add(mentoria5);
        bootcamp.getConteudos().add(mentoria6);
        bootcamp.getConteudos().add(mentoria7);
        bootcamp.getConteudos().add(mentoria8);


        Dev devEduardo = new Dev();
        devEduardo.setNome("Eduardo");
        devEduardo.inscreverBootcamp(bootcamp);

        for (int i=0; i<= (contCursos+contMentorias); i++){ //Progredindo todos os Cursos
            devEduardo.progredir();
        }

        System.out.println("-");
        System.out.println("Conteúdos Concluídos Eduardo:" + devEduardo.getConteudosConcluidos());
        System.out.println("XP:" + devEduardo.calcularTotalXp());




    }

}