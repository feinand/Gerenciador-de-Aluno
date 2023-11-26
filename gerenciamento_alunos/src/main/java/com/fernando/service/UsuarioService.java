package com.fernando.service;

import com.fernando.exception.CriptoExistsException;
import com.fernando.exception.EmailExistsException;
import com.fernando.repository.UsuarioRepository;
import com.fernando.exception.ServiceExc;
import com.fernando.model.Usuario;
import com.fernando.util.Util;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.security.NoSuchAlgorithmException;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    public void salvarUsuario(Usuario user) throws Exception {

        try {

            if(usuarioRepository.findByEmail(user.getEmail()) !=null) {
                throw new EmailExistsException("Este email já esta cadastrado: " + user.getEmail());
            }

            user.setSenha(Util.md5(user.getSenha()));

        } catch (NoSuchAlgorithmException e) {
            throw new CriptoExistsException("Error na criptografia da senha");
        }
        usuarioRepository.save(user);
    }

    public Usuario loginUser(String user, String senha) throws ServiceExc {

        return usuarioRepository.buscarLogin(user, senha);
    }
}