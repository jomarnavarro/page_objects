package com.imdb;

public class Main extends BaseTest {



    public static void main(String[] args) {

        configurarPrueba();

        home.navegarImdb("https://imdb.com");
        home.validarHomePage();
        home.navegarSignIn();

        menu.seleccionarMetodoLogin("imdb");

        login.login("jomarnavarro@gmail.com", "Test@1234");

        home.validarLigaUsuario("Omar");


	// write your code here
    }
}
