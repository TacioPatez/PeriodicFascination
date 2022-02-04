package model;

public class Atom {
  // ATRIBUTOS
  private String nome;
  private int camadas[] = new int[] { 0, 0, 0, 0, 0, 0, 0 };

  // CONSTRUTORES
  public Atom() {
  }

  public Atom(String name, int[] cam) {
    nome = name;

    for (int i = 0; i < 7; i++) {
      camadas[i] = cam[i];
    }
  }

/* ***************************************************************
* Metodo: getNome
* Funcao: retorna o nome do atomo
* Parametros: nenhum
* Retorno: retorna a String nome
*************************************************************** */
  public String getNome() {
    return nome;
  }

/* ***************************************************************
* Metodo: getCamadas
* Funcao: retorna um array int informando as quantos eletrons esta
          em cada camada.
* Parametros: nenhum
* Retorno: retorna o array de inteiros camadas
*************************************************************** */
  public int[] getCamadas() {
    return camadas;
  }
}
