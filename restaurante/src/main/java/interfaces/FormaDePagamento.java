/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package interfaces;

/**
 *
 * @author pedro
 */
public interface FormaDePagamento {
    String getTipo();
    double getDesconto();
    int getPrazoRecebimento();

    // Método para gerar nota fiscal
    String gerarNota();
}
