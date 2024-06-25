package controller;

import interfaces.FormaDePagamento;
import dao.*;
import model.*;
import model.Requisicao;
import view.RealizarPagamentoView;
import javax.swing.JOptionPane;

public class RealizarPagamentoController {

    private RealizarPagamentoView view;
    private Pedidos pedidos;
    private Requisicao requisicao;
    private Requisicoes r;
    private ListarPedidoController listarPedidoController;

    public RealizarPagamentoController(Requisicao req, ListarPedidoController listarPedidoController) {
        this.requisicao = req;
        this.view = new RealizarPagamentoView();
        this.pedidos = Pedidos.getInstancia();
        this.r = Requisicoes.getInstancia();
        this.listarPedidoController = listarPedidoController;
        this.view.getPixBtn().addActionListener((e) -> {
            pagarPix();
        });

        this.view.getDinheiroBtn().addActionListener((e) -> {
            pagarDinheiro();
        });

        this.view.getDebitoBtn().addActionListener((e) -> {
            pagarDebito();
        });

        this.view.getCreditoBtn().addActionListener((e) -> {
            pagarCredito();
        });

        this.view.setVisible(true);
    }

    private void pagarPix() {
        FormaDePagamento formaDePagamento = new Pix(); // Cria uma instância de Pix
        requisicao.getPedido().calcularValorTotal();
        double valorPedido = requisicao.getPedido().getTotalProdutos(); // Obtém o valor total do pedido
        formaDePagamento.calcularValorFinal(valorPedido); // Calcula o valor final com desconto
        formaDePagamento.setDataPagamento(); // Define a data do pagamento

        // Exibe a nota fiscal
        String notaFiscal = formaDePagamento.gerarNota();
        requisicao.getPedido().setFormaDePagamento(formaDePagamento);
        this.r.grava();
        JOptionPane.showMessageDialog(view, notaFiscal, "Nota Fiscal - Pagamento via Pix", JOptionPane.INFORMATION_MESSAGE);
        requisicao.getPedido().desativar();
        this.listarPedidoController.carregaTabelaPedido();
        
    }

    private void pagarDinheiro() {
        FormaDePagamento formaDePagamento = new Dinheiro(); // Cria uma instância de Pix
        requisicao.getPedido().calcularValorTotal();
        double valorPedido = requisicao.getPedido().getTotalProdutos(); // Obtém o valor total do pedido
        formaDePagamento.calcularValorFinal(valorPedido); // Calcula o valor final com desconto
        formaDePagamento.setDataPagamento(); // Define a data do pagamento

        // Exibe a nota fiscal
        String notaFiscal = formaDePagamento.gerarNota();
        requisicao.getPedido().setFormaDePagamento(formaDePagamento);
        this.r.grava();
        JOptionPane.showMessageDialog(view, notaFiscal, "Nota Fiscal - Pagamento via Dinheiro", JOptionPane.INFORMATION_MESSAGE);
        requisicao.getPedido().desativar();
        this.listarPedidoController.carregaTabelaPedido();
    }

    private void pagarDebito() {
        FormaDePagamento formaDePagamento = new Debito(); // Cria uma instância de Pix
        requisicao.getPedido().calcularValorTotal();
        double valorPedido = requisicao.getPedido().getTotalProdutos(); // Obtém o valor total do pedido
        formaDePagamento.calcularValorFinal(valorPedido); // Calcula o valor final com desconto
        formaDePagamento.setDataPagamento(); // Define a data do pagamento

        // Exibe a nota fiscal
        String notaFiscal = formaDePagamento.gerarNota();
        requisicao.getPedido().setFormaDePagamento(formaDePagamento);
        this.r.grava();
        JOptionPane.showMessageDialog(view, notaFiscal, "Nota Fiscal - Pagamento via Debito", JOptionPane.INFORMATION_MESSAGE);
        requisicao.getPedido().desativar();
        this.listarPedidoController.carregaTabelaPedido();
    }

    private void pagarCredito() {
        FormaDePagamento formaDePagamento = new Credito(); // Cria uma instância de Pix
        requisicao.getPedido().calcularValorTotal();
        double valorPedido = requisicao.getPedido().getTotalProdutos(); // Obtém o valor total do pedido
        formaDePagamento.calcularValorFinal(valorPedido); // Calcula o valor final com desconto
        formaDePagamento.setDataPagamento(); // Define a data do pagamento

        // Exibe a nota fiscal
        String notaFiscal = formaDePagamento.gerarNota();
        requisicao.getPedido().setFormaDePagamento(formaDePagamento);
        this.r.grava();
        JOptionPane.showMessageDialog(view, notaFiscal, "Nota Fiscal - Pagamento via Credito", JOptionPane.INFORMATION_MESSAGE);
        requisicao.getPedido().desativar();
        this.listarPedidoController.carregaTabelaPedido();
    }

}
