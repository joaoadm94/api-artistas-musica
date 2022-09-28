package br.com.ada.banco.artistasmusica.service.impl;

import org.springframework.stereotype.Service;

import br.com.ada.banco.artistasmusica.entity.Usuario;
import br.com.ada.banco.artistasmusica.repository.UsuarioRepository;
import br.com.ada.banco.artistasmusica.service.UsuarioService;

@Service
public class UsuarioServiceImpl implements UsuarioService {

    final UsuarioRepository usuarioRepository;

    public UsuarioServiceImpl(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }

    @Override
    public Usuario save(Usuario usuario) {
        return usuarioRepository.save(usuario);
    }

    @Override
    public Usuario update(Usuario usuario) {
        return usuarioRepository.save(usuario);
    }

    @Override
    public void delete(Long produtoId) {
        usuarioRepository.deleteById(produtoId);
    }

    @Override
    public void deactivate(Long usuarioId) {
        // TODO Auto-generated method stub 
    }

    @Override
    public Usuario getById(Long usuarioId) {
        return usuarioRepository.findById(usuarioId).get();
    }
    
}
