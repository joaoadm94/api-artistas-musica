package br.com.ada.banco.artistasmusica.service;

import br.com.ada.banco.artistasmusica.entity.Usuario;

public interface UsuarioService {

    Usuario save(Usuario usuario);
    
    Usuario update(Usuario usuario);

    void delete (Long produtoId);

    void deactivate(Long usuarioId);

    Usuario getById(Long usuarioId);
}
