package devandroid.matheus.appminhaideiadb.controller;

import java.util.List;

public interface ICrud<T> {
    //Em interface só são aceitos os métodos, sem o corpo ou funções dos métodos.
    //CRUD- Create-Retrieve-Update-Delete
    //Create
    public boolean incluir(T obj);
    //Retrieve
    public List<T> listar();
    //Update
    public boolean alterar(T obj);
    //Delete
    public boolean deletar(T obj);


}
