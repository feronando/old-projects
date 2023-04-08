package ifrn.model;

import java.util.List;

public interface BannerDAO_I {
    /** Adiciona um banner caso ele não exista*/
    public boolean adicionar(Banner banner);
    /** Verifica se um banner já existe */
    public boolean existe(Banner banner); 
    /** Obtém todos os banners cadastrados */
    public List<Banner> obterTodos(); 
    /** Obtém um determinado banner. 
     *  @param titulo título do banner
     *  @return o banner, caso exista, ou null. 
     */
    public Banner obter(String titulo); 
    /** Atualiza os valores de um banner */
    public boolean atualizar(Banner banner); 
    /** Remove o banner */
    public boolean remover(Banner banner);
    
}
