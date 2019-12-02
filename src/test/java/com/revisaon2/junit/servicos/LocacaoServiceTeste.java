package com.revisaon2.junit;

import com.revisaon2.junit.entidades.Filme;
import com.revisaon2.junit.entidades.Locacao;
import com.revisaon2.junit.entidades.Usuario;
import com.revisaon2.junit.servicos.LocacaoService;
import com.revisaon2.junit.utils.DataUtils;
import org.junit.Assert;
import org.junit.Test;

import java.util.Date;

public class LocacaoServiceTeste {

    @Test
    public void teste() {
        //Cenário
        LocacaoService locacaoService = new LocacaoService();
        Usuario usuario = new Usuario("Usuário 1");
        Filme filme = new Filme("Filme 1", 2, 5.0);

        //Ação
        Locacao locacao = locacaoService.alugarFilme(usuario, filme);

        //Verificação
        Assert.assertTrue(locacao.getValor() == 5.0);
        Assert.assertTrue(DataUtils.isMesmaData(locacao.getDataLocacao(), new Date()));
        Assert.assertTrue(DataUtils.isMesmaData(locacao.getDataRetorno(), DataUtils.obterDataComDiferencaDias(1)));
    }
}
