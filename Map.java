public class Map {

    static String[][] matrix =
            {{"#"," ","#"," ","#"," ","#"," ","#"," ","#"," ","#"," ","#"," ","#"," ","#"," ","#"," ","#"," ","#"," ","#"," ","#"," ","#"," ","#"," ","#"," ","#"," ","#"," ","#"," ","#"," ","#"," ","#"," ","#"," ","#"," ","#"," ","#"," ","#"," ","#"," ","#"," ","#"," ","#"," ","#"," ","#"," ","#"," ","#"},
             {"#"," ","#"," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," ","#"," ","#"," ","#"," ","#"," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," ","#"," ","#"}
            ,{"#"," ","#"," "," "," "," "," ","#"," ","#"," ","#"," ","#"," ","#"," "," "," ","#"," ","#"," ","#"," ","#"," ","#"," ","#"," "," "," ","#"," ","#"," ","#"," ","#"," "," "," ","#"," ","#"," ","#"," ","#"," ","#"," ","#"," "," "," ","#"," ","#"," ","#"," ","#"," "," "," "," "," ","#"," ","#"}
            ,{"#"," ","#"," "," "," "," "," ","#"," ","#"," ","#"," ","#"," ","#"," "," "," ","#"," ","#"," ","#"," ","#"," ","#"," ","#"," "," "," ","#"," ","#"," ","#"," ","#"," "," "," ","#"," ","#"," ","#"," ","#"," ","#"," ","#"," "," "," ","#"," ","#"," ","#"," ","#"," "," "," "," "," ","#"," ","#"}
            ,{"#"," ","#"," "," "," "," "," ","#"," ","#"," ","#"," ","#"," ","#"," "," "," ","#"," ","#"," ","#"," ","#"," ","#"," ","#"," "," "," ","#"," ","#"," ","#"," ","#"," "," "," ","#"," ","#"," ","#"," ","#"," ","#"," ","#"," "," "," ","#"," ","#"," ","#"," ","#"," "," "," "," "," ","#"," ","#"}
            ,{"#"," ","#"," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," ","#"," ","#"}
            ,{"#"," ","#"," "," "," "," "," ","#"," ","#"," ","#"," ","#"," ","#"," "," "," ","#"," ","#"," ","#"," ","#"," "," "," ","#"," ","#"," ","#"," ","#"," ","#"," ","#"," ","#"," ","#"," "," "," ","#"," ","#"," ","#"," ","#"," "," "," ","#"," ","#"," ","#"," ","#"," "," "," "," "," ","#"," ","#"}
            ,{"#"," ","#"," "," "," "," "," ","#"," ","#"," ","#"," ","#"," ","#"," "," "," ","#"," ","#"," ","#"," ","#"," "," "," ","#"," ","#"," ","#"," ","#"," ","#"," ","#"," ","#"," ","#"," "," "," ","#"," ","#"," ","#"," ","#"," "," "," ","#"," ","#"," ","#"," ","#"," "," "," "," "," ","#"," ","#"}
            ,{"#"," ","#"," "," "," "," "," ","#"," ","#"," ","#"," ","#"," ","#"," "," "," ","#"," ","#"," ","#"," ","#"," "," "," "," "," "," "," "," "," ","#"," ","#"," "," "," "," "," "," "," "," "," ","#"," ","#"," ","#"," ","#"," "," "," ","#"," ","#"," ","#"," ","#"," "," "," "," "," ","#"," ","#"}
            ,{"#"," ","#"," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," ","#"," ","#"," ","#"," ","#"," ","#"," ","#"," ","#"," "," "," ","#"," ","#"," "," "," ","#"," ","#"," ","#"," ","#"," ","#"," ","#"," ","#"," "," "," "," "," "," "," "," "," "," "," "," "," "," "," ","#"," ","#"}
            ,{"#"," ","#"," ","#"," ","#"," ","#"," ","#"," ","#"," ","#"," ","#"," "," "," ","#"," ","#"," ","#"," ","#"," ","#"," ","#"," ","#"," "," "," ","#"," ","#"," "," "," ","#"," ","#"," ","#"," ","#"," ","#"," ","#"," ","#"," "," "," ","#"," ","#"," ","#"," ","#"," ","#"," ","#"," ","#"," ","#"}
            ,{"#"," ","#"," ","#"," ","#"," ","#"," ","#"," ","#"," ","#"," ","#"," "," "," ","#"," ","#"," ","#"," "," "," "," "," "," "," "," "," "," "," ","#"," ","#"," "," "," "," "," "," "," "," "," "," "," ","#"," ","#"," ","#"," "," "," ","#"," ","#"," ","#"," ","#"," ","#"," ","#"," ","#"," ","#"}
            ,{"#"," ","#"," ","#"," ","#"," ","#"," ","#"," ","#"," ","#"," ","#"," "," "," ","#"," ","#"," ","#"," ","#"," ","#"," ","#"," ","#"," "," "," ","#"," ","#"," "," "," ","#"," ","#"," ","#"," ","#"," ","#"," ","#"," ","#"," "," "," ","#"," ","#"," ","#"," ","#"," ","#"," ","#"," ","#"," ","#"}
            ,{"#"," ","#"," ","#"," ","#"," ","#"," ","#"," ","#"," ","#"," ","#"," "," "," ","#"," ","#"," ","#"," ","#"," ","#"," ","#"," ","#"," "," "," ","#"," ","#"," "," "," ","#"," ","#"," ","#"," ","#"," ","#"," ","#"," ","#"," "," "," ","#"," ","#"," ","#"," ","#"," ","#"," ","#"," ","#"," ","#"}
            ,{"#"," ","#"," ","#"," ","#"," ","#"," ","#"," ","#"," ","#"," ","#"," "," "," ","#"," ","#"," ","#"," ","#"," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," ","#"," ","#"," ","#"," ","#"," "," "," ","#"," ","#"," ","#"," ","#"," ","#"," ","#"," ","#"," ","#"}
            ,{"#"," ","#"," ","#"," ","#"," ","#"," ","#"," ","#"," ","#"," ","#"," "," "," ","#"," ","#"," ","#"," ","#"," "," "," ","#"," ","#"," ","#"," ","#"," ","#"," ","#"," ","#"," ","#"," "," "," ","#"," ","#"," ","#"," ","#"," "," "," ","#"," ","#"," ","#"," ","#"," ","#"," ","#"," ","#"," ","#"}
            ,{"#"," ","#"," ","#"," ","#"," ","#"," ","#"," ","#"," ","#"," ","#"," "," "," ","#"," ","#"," ","#"," ","#"," "," "," ","#"," ","#"," ","#"," ","#"," ","#"," ","#"," ","#"," ","#"," "," "," ","#"," ","#"," ","#"," ","#"," "," "," ","#"," ","#"," ","#"," ","#"," ","#"," ","#"," ","#"," ","#"}
            ,{"#"," ","#"," ","#"," ","#"," ","#"," ","#"," ","#"," ","#"," ","#"," "," "," ","#"," ","#"," ","#"," ","#"," "," "," ","#"," ","#"," ","#"," ","#"," ","#"," ","#"," ","#"," ","#"," "," "," ","#"," ","#"," ","#"," ","#"," "," "," ","#"," ","#"," ","#"," ","#"," ","#"," ","#"," ","#"," ","#"}
            ,{"#"," ","#"," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," ","#"," ","#"," ","#"," ","#"," ","#"," ","#"," ","#"," ","#"," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," ","#"," ","#"}
            ,{"#"," ","#"," ","#"," ","#"," ","#"," ","#"," ","#"," ","#"," ","#"," "," "," ","#"," ","#"," ","#"," ","#"," "," "," ","#"," ","#"," ","#"," ","#"," ","#"," ","#"," ","#"," ","#"," "," "," ","#"," ","#"," ","#"," ","#"," "," "," ","#"," ","#"," ","#"," ","#"," ","#"," ","#"," ","#"," ","#"}
            ,{"#"," ","#"," ","#"," ","#"," ","#"," ","#"," ","#"," ","#"," ","#"," "," "," ","#"," ","#"," ","#"," ","#"," "," "," ","#"," ","#"," ","#"," ","#"," ","#"," ","#"," ","#"," ","#"," "," "," ","#"," ","#"," ","#"," ","#"," "," "," ","#"," ","#"," ","#"," ","#"," ","#"," ","#"," ","#"," ","#"}
            ,{"#"," ","#"," ","#"," ","#"," ","#"," ","#"," ","#"," ","#"," ","#"," "," "," ","#"," ","#"," ","#"," ","#"," "," "," ","#"," ","#"," ","#"," ","#"," ","#"," ","#"," ","#"," ","#"," "," "," ","#"," ","#"," ","#"," ","#"," "," "," ","#"," ","#"," ","#"," ","#"," ","#"," ","#"," ","#"," ","#"}
            ,{"#"," ","#"," "," "," "," "," "," "," ","#"," ","#"," ","#"," ","#"," "," "," ","#"," ","#"," ","#"," ","#"," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," ","#"," ","#"," ","#"," ","#"," "," "," ","#"," ","#"," ","#"," "," "," "," "," "," "," ","#"," ","#"}
            ,{"#"," ","#"," "," "," ","#"," ","#"," ","#"," ","#"," ","#"," ","#"," "," "," ","#"," ","#"," ","#"," ","#"," "," "," ","#"," ","#"," ","#"," ","#"," ","#"," ","#"," ","#"," ","#"," "," "," ","#"," ","#"," ","#"," ","#"," "," "," ","#"," ","#"," ","#"," ","#"," ","#"," "," "," ","#"," ","#"}
            ,{"#"," ","#"," "," "," ","#"," ","#"," ","#"," ","#"," ","#"," ","#"," "," "," ","#"," ","#"," ","#"," ","#"," "," "," ","#"," ","#"," ","#"," ","#"," ","#"," ","#"," ","#"," ","#"," "," "," ","#"," ","#"," ","#"," ","#"," "," "," ","#"," ","#"," ","#"," ","#"," ","#"," "," "," ","#"," ","#"}
            ,{"#"," ","#"," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," ","#"," ","#"," ","#"," ","#"," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," ","#"," ","#"}
            ,{"#"," ","#"," "," "," ","#"," ","#"," ","#"," ","#"," ","#"," ","#"," "," "," ","#"," ","#"," ","#"," ","#"," ","#"," ","#"," "," "," ","#"," ","#"," ","#"," ","#"," "," "," ","#"," ","#"," ","#"," ","#"," ","#"," ","#"," "," "," ","#"," ","#"," ","#"," ","#"," ","#"," "," "," ","#"," ","#"}
            ,{"#"," ","#"," "," "," "," "," "," "," ","#"," ","#"," ","#"," ","#"," "," "," ","#"," ","#"," ","#"," ","#"," ","#"," ","#"," "," "," ","#"," ","#"," ","#"," ","#"," "," "," ","#"," ","#"," ","#"," ","#"," ","#"," ","#"," "," "," ","#"," ","#"," ","#"," "," "," "," "," "," "," ","#"," ","#"}
            ,{"#"," ","#"," ","#"," "," "," "," "," ","#"," ","#"," ","#"," ","#"," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," ","#"," ","#"," ","#"," "," "," ","#"," ","#"," ","#"," ","#"}
            ,{"#"," ","#"," ","#"," "," "," "," "," ","#"," ","#"," ","#"," ","#"," "," "," ","#"," ","#"," ","#"," ","#"," ","#"," ","#"," "," "," ","#"," ","#"," ","#"," ","#"," ","#"," "," "," ","#"," ","#"," ","#"," ","#"," ","#"," "," "," ","#"," ","#"," ","#"," "," "," ","#"," ","#"," ","#"," ","#"}
            ,{"#"," ","#"," ","#"," "," "," "," "," ","#"," ","#"," ","#"," ","#"," "," "," ","#"," ","#"," ","#"," ","#"," ","#"," ","#"," "," "," ","#"," ","#"," ","#"," ","#"," ","#"," "," "," ","#"," ","#"," ","#"," ","#"," ","#"," "," "," ","#"," ","#"," ","#"," "," "," ","#"," ","#"," ","#"," ","#"}
            ,{"#"," ","#"," ","#"," "," "," "," "," ","#"," ","#"," ","#"," ","#"," "," "," ","#"," ","#"," ","#"," ","#"," ","#"," ","#"," "," "," "," "," ","#"," ","#"," ","#"," "," "," "," "," ","#"," ","#"," ","#"," ","#"," ","#"," "," "," ","#"," ","#"," ","#"," "," "," ","#"," ","#"," ","#"," ","#"}
            ,{"#"," ","#"," ","#"," "," "," "," "," ","#"," ","#"," ","#"," ","#"," "," "," ","#"," ","#"," ","#"," ","#"," ","#"," ","#"," ","#"," "," "," ","#"," ","#"," ","#"," "," "," ","#"," ","#"," ","#"," ","#"," ","#"," ","#"," "," "," ","#"," ","#"," ","#"," "," "," ","#"," ","#"," ","#"," ","#"}
            ,{"#"," ","#"," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," ","#"," ","#"}
            ,{"#"," ","#"," ","#"," ","#"," ","#"," ","#"," ","#"," ","#"," ","#"," ","#"," ","#"," ","#"," ","#"," ","#"," ","#"," ","#"," ","#"," ","#"," ","#"," ","#"," ","#"," ","#"," ","#"," ","#"," ","#"," ","#"," ","#"," ","#"," ","#"," ","#"," ","#"," ","#"," ","#"," ","#"," ","#"," ","#"," ","#"}};

}