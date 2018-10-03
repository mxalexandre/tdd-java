package java.com.mxalexandre.tdd.service;

import java.com.mxalexandre.tdd.domain.Lance;
import java.com.mxalexandre.tdd.domain.Leilao;
import java.com.mxalexandre.tdd.domain.Usuario;
import org.junit.Assert;
import org.junit.Test;

public class TesteDoAvaliador {

  @Test
  public void main() {
    Usuario joao = new Usuario("João");
    Usuario jose = new Usuario("José");
    Usuario maria = new Usuario("maria");

    Leilao leilao = new Leilao(("Playsstation 3 novo"));

    leilao.propoe(new Lance(joao, 300.0));
    leilao.propoe(new Lance(jose, 400.0));
    leilao.propoe(new Lance(maria, 250));

    Avaliador leiloeiro = new Avaliador();
    leiloeiro.avalia(leilao);

    double maiorEsperado = 400;
    double menorEsperado = 250;

    Assert.assertEquals(maiorEsperado, leiloeiro.getMaiorLance(), 0.00001);
    Assert.assertEquals(menorEsperado, leiloeiro.getMenorLance(), 0.00001);
  }

}
