package devandroid.matheus.appminhaideiadb.datamodel;

public class ClienteDataModel {
    //Modelo objeto relacional
    //Toda classe Data Model tem esta estrutura
    //1- Atributo nome da tabela
    public static final String TABELA = "cliente";
    //2- Atributos um para um, com nomes dos campos
    public static final String ID = "id";
    public static final String NOME = "nome";
    public static final String EMAIL = "email";
    //3- Query para criar a tabela no banco de dados
    public static String queryCirarTabela = "";
    //4- Método para gerar o script para criar a tabela
    public static String criarTabela(){
        //Concatenação de string
        queryCirarTabela+= "CREATE TABLE "+TABELA+" (";
        queryCirarTabela+= ID+" integer primary key autoincrement, ";
        queryCirarTabela+= NOME+" text, ";
        queryCirarTabela+= EMAIL+" text ";
        queryCirarTabela+= ")";
        return queryCirarTabela;
    }
    //5- Queries de consulta gerais
}
