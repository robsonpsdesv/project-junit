package com.revisaon2.junit.servicos;

import com.revisaon2.junit.entidades.Filme;
import com.revisaon2.junit.entidades.Locacao;
import com.revisaon2.junit.entidades.Usuario;
import com.revisaon2.junit.utils.DataUtils;
import org.junit.Assert;
import org.junit.Test;

import java.util.Date;

public class LocacaoService {

    public Locacao alugarFilme(Usuario usuario, Filme filme){
        Locacao locacao = new Locacao();
        locacao.setFilme(filme);
        locacao.setUsuario(usuario);
        locacao.setDataLocacao(new Date());
        locacao.setValor(filme.getPreLocacao());

        //Entrega no dia seguinte
        Date dataEntrega = new Date();
        dataEntrega = DataUtils.adicionarDias(dataEntrega, 1);
        locacao.setDataRetorno(dataEntrega);

        //Salvando a locação...
        //TODO adicionar método salvar

        return locacao;
    }

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
