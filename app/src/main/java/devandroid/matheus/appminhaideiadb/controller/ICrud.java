package devandroid.matheus.appminhaideiadb.controller;

public interface ICrud {
    //Em interface só são aceitos os métodos, sem o corpo ou funções dos métodos.
    //CRUD- Create-Retrieve-Update-Delete

    //Create
    public void incluir();
    //Retrieve
    public void listar();
    //Update
    public void alterar();
    //Delete
    public void deletar();


}
