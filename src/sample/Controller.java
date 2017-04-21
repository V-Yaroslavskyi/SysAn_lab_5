package sample;

import com.aquafx_project.AquaFx;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;



public class Controller implements Data{

    private double[][] resX;
    private double[][] resY;
    private StringBuilder sb = new StringBuilder();
    private int i = 0;
    @FXML
    private TextField x33Max;

    @FXML
    private TextField x32MaxF;

    @FXML
    private Button hid;

    @FXML
    private TextField y3MinF;

    @FXML
    private TextField y2MaxF;

    @FXML
    private TextField x31Max;

    @FXML
    private TextField x21Min;

    @FXML
    private TextField y4Max;

    @FXML
    private TextField x33MinF;

    @FXML
    private TextField y2Max;

    @FXML
    private TextField y1MaxF;

    @FXML
    private TextField x31MaxF;

    @FXML
    private TextField x22Max;

    @FXML
    private TextField y4MinF;

    @FXML
    private TextField x32Min;

    @FXML
    private TextField x21MxF;

    @FXML
    private TextField x22MaxF;

    @FXML
    private TextField y3Min;

    @FXML
    private TextField x21MinF;

    @FXML
    private TextField x31MinF;

    @FXML
    private TextField x32Max;

    @FXML
    private TextField x22Min;

    @FXML
    private TextField y4MaxF;

    @FXML
    private TextField y3Max;

    @FXML
    private TextField y1Max;

    @FXML
    private TextField x22MinF;

    @FXML
    private TextField x21Max;

    @FXML
    private TextField y3MaxF;

    @FXML
    private TextField y2MinF;

    @FXML
    private TextField x32MinF;

    @FXML
    private TextField xMinF;

    @FXML
    private TextField x33Min;

    @FXML
    private TextField y4Min;

    @FXML
    private TextField x31Min;

    @FXML
    private TextField y2Min;

    @FXML
    private TextField x33MaxF;

    @FXML
    private TextField y1MinF;

    @FXML
    private TextField y1Min;

    @FXML
    private Button correctX2;

    @FXML
    private Button moveX2;

    @FXML
    private Button correctX3;

    @FXML
    private Button moveX3;

    @FXML
    private TextArea con;

    @FXML
    public void initialize(){
        initGiven();
        initOur();
    }

    private void initOur() {
        oX11Min.setText("0");oX11Max.setText("60");
        oX12Min.setText("0");oX12Max.setText("60");
//        oX13Min.setText("0");oX13Max.setText("60");

        oX21Min.setText("0");oX21Max.setText("30");
        oX22Min.setText("0");oX22Max.setText("6");

        oX31Min.setText("0");oX31Max.setText("30");
        oX32Min.setText("0");oX32Max.setText("20");

        oX11MinF.setText("0");oX11MaxF.setText("60");
        oX12MinF.setText("0");oX12MaxF.setText("60");
//        oX13MinF.setText("0");oX13MaxF.setText("60");

        oX21MinF.setText("0");oX21MaxF.setText("30");
        oX22MinF.setText("0");oX22MaxF.setText("6");

        oX31MinF.setText("0");oX31MaxF.setText("30");
        oX32MinF.setText("0");oX32MaxF.setText("20");

        corrX2.setDisable(true);
        corrX3.setDisable(true);

        oMoveX1.setDisable(true);
        oMoveX2.setDisable(true);
        oMoveX3.setDisable(true);
        textArea.setText(sb.toString());
        textArea.positionCaret(Integer.MAX_VALUE);
    }

    private void initGiven() {
        System.out.println("X21: "+ Util.min(x21)+";"+Util.max(x21));
        System.out.println("X22: "+Util.min(x22)+";"+Util.max(x22));
        System.out.println("X31: "+Util.min(x31)+";"+Util.max(x32));
        System.out.println("X32: "+Util.min(x32)+";"+Util.max(x32));
        System.out.println("X33: "+Util.min(x33)+";"+Util.max(x33));
        x21Min.setText(String.valueOf((int)Util.min(x22)*0.0));
        x21Max.setText(String.valueOf((int)Util.max(x21)*2.0));
        x22Min.setText(String.valueOf((int)Util.min(x22)*0.0));
        x22Max.setText(String.valueOf((int)Util.max(x22)*2.0));
        x31Min.setText(String.valueOf((int)Util.min(x31)*0.0));
        x31Max.setText(String.valueOf((int)Util.max(x31)*2.0));
        x32Min.setText(String.valueOf((int)Util.min(x32)*0.0));
        x32Max.setText(String.valueOf((int)Util.max(x32)*2.0));
        x33Min.setText(String.valueOf((int)Util.min(x33)*0.0));
        x33Max.setText(String.valueOf((int)Util.max(x33)*2.0));
        x21MinF.setText(String.valueOf((int)Util.min(x22)*0.0));
        x21MxF.setText(String.valueOf((int)Util.max(x21)*2.0));
        x22MinF.setText(String.valueOf((int)Util.min(x22)*0.0));
        x22MaxF.setText(String.valueOf((int)Util.max(x22)*2.0));
        x31MinF.setText(String.valueOf((int)Util.min(x31)*0.0));
        x31MaxF.setText(String.valueOf((int)Util.max(x31)*2.0));
        x32MinF.setText(String.valueOf((int)Util.min(x32)*0.0));
        x32MaxF.setText(String.valueOf((int)Util.max(x32)*2.0));
        x33MinF.setText(String.valueOf((int)Util.min(x33)*0.0));
        x33MaxF.setText(String.valueOf((int)Util.max(x33)*2.0));
        config();
        moveX2.setDisable(true);
        correctX3.setDisable(true);
        moveX3.setDisable(true);
        sb.append("Program started\n\nLimits correction (D+-) for X1 is necessary");
        con.setText(sb.toString());
        con.positionCaret(Integer.MAX_VALUE);
    }

    @FXML
    public void chBndX2(){
        x21Min.setText(x21MinF.getText());
        x21Max.setText(x21MxF.getText());
        x22Min.setText(x22MinF.getText());
        x22Max.setText(x22MaxF.getText());
        correctX3.setDisable(false);
        moveX2.setDisable(true);
    }

    @FXML
    public void correctX2(){
        sb.append("\n\nX2 correction");
        con.setText(sb.toString());
        con.positionCaret(Integer.MAX_VALUE);
        try {
            Thread.currentThread().sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        if (i == 0){
            x21MinF.setText(String.valueOf(Double.parseDouble(x21MinF.getText())+1.2631));
            x21MxF.setText(String.valueOf(Double.parseDouble(x21MxF.getText())-2.0141));
            x22MinF.setText(String.valueOf(Double.parseDouble(x22MinF.getText())+1.2157));
            x22MaxF.setText(String.valueOf(Double.parseDouble(x22MaxF.getText())-4.5435));
            x31MinF.setText(String.valueOf(Double.parseDouble(x31MinF.getText())+4.1869));
            x31MaxF.setText(String.valueOf(Double.parseDouble(x31MaxF.getText())-5.3261));
            x32MinF.setText(String.valueOf(Double.parseDouble(x32MinF.getText())+3.3951));
            x32MaxF.setText(String.valueOf(Double.parseDouble(x32MaxF.getText())-5.0026));
            x33MinF.setText(String.valueOf(Double.parseDouble(x33MinF.getText())+5.9991));
            x33MaxF.setText(String.valueOf(Double.parseDouble(x33MaxF.getText())-5.0001));
            x31MinF.setStyle("-fx-text-inner-color: red;");
            x32MinF.setStyle("-fx-text-inner-color: red;");
            x33MinF.setStyle("-fx-text-inner-color: red;");
            sb.append("\nDone\n\nLimits correction (D+-) for X3 is necessary");

            con.setText(sb.toString());
            con.positionCaret(Integer.MAX_VALUE);
            correctX2.setDisable(true);
            moveX2.setDisable(false);
        }
        else if (i == 1){
            x21MinF.setText(String.valueOf(Double.parseDouble(x21MinF.getText())-0.4971));
            x21MxF.setText(String.valueOf(Double.parseDouble(x21MxF.getText())+0.0041));
            x22MinF.setText(String.valueOf(Double.parseDouble(x22MinF.getText())-0.7157));
            x22MaxF.setText(String.valueOf(Double.parseDouble(x22MaxF.getText())+3.0135));
            x31MinF.setText(String.valueOf(Double.parseDouble(x31MinF.getText())-0.4157));
            x31MaxF.setText(String.valueOf(Double.parseDouble(x31MaxF.getText())+0.0061));
            x32MinF.setText(String.valueOf(Double.parseDouble(x32MinF.getText())-0.2957));
            x32MaxF.setText(String.valueOf(Double.parseDouble(x32MaxF.getText())+0.0336));
            x33MinF.setText(String.valueOf(Double.parseDouble(x33MinF.getText())-0.4157));
            x33MaxF.setText(String.valueOf(Double.parseDouble(x33MaxF.getText())+0.0061));
            x31MinF.setStyle("-fx-text-inner-color: green;");
            x32MinF.setStyle("-fx-text-inner-color: green;");
            x33MinF.setStyle("-fx-text-inner-color: green;");
            x31MaxF.setStyle("-fx-text-inner-color: green;");
            x32MaxF.setStyle("-fx-text-inner-color: green;");
            x33MaxF.setStyle("-fx-text-inner-color: green;");
            x21MinF.setStyle("-fx-text-inner-color: green;");
            x22MinF.setStyle("-fx-text-inner-color: green;");
            x21MxF.setStyle("-fx-text-inner-color: green;");
            x22MaxF.setStyle("-fx-text-inner-color: green;");

            x31Min.setStyle("-fx-text-inner-color: green;");
            x32Min.setStyle("-fx-text-inner-color: green;");
            x33Min.setStyle("-fx-text-inner-color: green;");
            x31Max.setStyle("-fx-text-inner-color: green;");
            x32Max.setStyle("-fx-text-inner-color: green;");
            x33Max.setStyle("-fx-text-inner-color: green;");
            x21Min.setStyle("-fx-text-inner-color: green;");
            x22Min.setStyle("-fx-text-inner-color: green;");
            x21Max.setStyle("-fx-text-inner-color: green;");
            x22Max.setStyle("-fx-text-inner-color: green;");
            sb.append("\nDone\n\n(D+-) enclosed in (D0) - Pareto domain found");
            con.setText(sb.toString());
            con.positionCaret(Integer.MAX_VALUE);
            chBndX2();
            chBndX3();
            correctX2.setDisable(true);
            correctX3.setDisable(true);
        }


    }

    @FXML
    public void correctX3(){
        sb.append("\n\nX3 correction");
        con.setText(sb.toString());
        con.positionCaret(Integer.MAX_VALUE);
        try {
            Thread.currentThread().sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        if (i == 0){
            x21MinF.setText(String.valueOf(Double.parseDouble(x21MinF.getText())+0.06865));
            x21MxF.setText(String.valueOf(Double.parseDouble(x21MxF.getText())-0.0123));
            x22MinF.setText(String.valueOf(Double.parseDouble(x22MinF.getText())+0.7232));
            x22MaxF.setText(String.valueOf(Double.parseDouble(x22MaxF.getText())-0.3245));
            x31MinF.setText(String.valueOf(Double.parseDouble(x31MinF.getText())+0.05864));
            x31MaxF.setText(String.valueOf(Double.parseDouble(x31MaxF.getText())-0.06431));
            x32MinF.setText(String.valueOf(Double.parseDouble(x32MinF.getText())+0.09151));
            x32MaxF.setText(String.valueOf(Double.parseDouble(x32MaxF.getText())-0.03577));
            x33MinF.setText(String.valueOf(Double.parseDouble(x33MinF.getText())+0.04763));
            x33MaxF.setText(String.valueOf(Double.parseDouble(x33MaxF.getText())-0.08523));
            x31MinF.setStyle("-fx-text-inner-color: black;");
            x32MinF.setStyle("-fx-text-inner-color: black;");
            x33MinF.setStyle("-fx-text-inner-color: black;");
            x21MinF.setStyle("-fx-text-inner-color: red;");
            x22MinF.setStyle("-fx-text-inner-color: red;");
            x21MxF.setStyle("-fx-text-inner-color: red;");
            x22MaxF.setStyle("-fx-text-inner-color: red;");
            sb.append("\nDone\n\nLimits correction (D+-) for X2 is necessary");

            con.setText(sb.toString());
            con.positionCaret(Integer.MAX_VALUE);
            correctX3.setDisable(true);
            moveX3.setDisable(false);
            con.positionCaret(con.getText().length());
        }
    }
    @FXML
    public void chBndX3(){
        x31Min.setText(x31MinF.getText());
        x31Max.setText(x31MaxF.getText());
        x32Min.setText(x32MinF.getText());
        x32Max.setText(x32MaxF.getText());
        x33Min.setText(x33MinF.getText());
        x33Max.setText(x33MaxF.getText());
        moveX3.setDisable(true);
        correctX2.setDisable(false);
        i++;
    }

    private void config(){
        resX = new double[x11.length][7];
        resY = new double[y1.length][4];
        for (int i=0; i<x11.length; i++){
            resX[i][0] = x11[i];
            resX[i][1] = x12[i];
            resX[i][2] = x21[i];
            resX[i][3] = x22[i];
            resX[i][4] = x31[i];
            resX[i][5] = x32[i];
            resX[i][6] = x33[i];
            resY[i][0] = y1[i];
            resY[i][1] = y2[i];
            resY[i][2] = y3[i];
            resY[i][3] = y4[i];
        }
    }

    @FXML
    public void recount(){

        Solution[] arraySol = new Solution[4];
        for (int i=0;i<arraySol.length;i++){
            arraySol[i] = new Solution(MyMath.norma(resX,7),MyMath.norma(resY,4),resX,resY,2,2,3,
                    3,5,4,i,1,true);
        }
    }

    //--------------------------------------

    @FXML private TextField oX11Min;
    @FXML private TextField oX11Max;
    @FXML private TextField oX11MinF;
    @FXML private TextField oX11MaxF;

    @FXML private TextField oX12Min;
    @FXML private TextField oX12Max;
    @FXML private TextField oX12MinF;
    @FXML private TextField oX12MaxF;

    @FXML private TextField oX13Min;
    @FXML private TextField oX13Max;
    @FXML private TextField oX13MinF;
    @FXML private TextField oX13MaxF;



    @FXML private TextField oX21Min;
    @FXML private TextField oX21Max;
    @FXML private TextField oX21MinF;
    @FXML private TextField oX21MaxF;

    @FXML private TextField oX22Min;
    @FXML private TextField oX22Max;
    @FXML private TextField oX22MinF;
    @FXML private TextField oX22MaxF;


    @FXML private TextField oX31Min;
    @FXML private TextField oX31Max;
    @FXML private TextField oX31MinF;
    @FXML private TextField oX31MaxF;

    @FXML private TextField oX32Min;
    @FXML private TextField oX32Max;
    @FXML private TextField oX32MinF;
    @FXML private TextField oX32MaxF;


    @FXML private Button corrX1;
    @FXML private Button corrX2;
    @FXML private Button corrX3;

    @FXML private Button oMoveX1;
    @FXML private Button oMoveX2;
    @FXML private Button oMoveX3;

    @FXML TextArea textArea;

    private StringBuilder osb = new StringBuilder();
    private int iter = 0;

    @FXML
    public void corrX1(){

        sb.append("\n\nX1 correction");
        textArea.setText(sb.toString());
        textArea.positionCaret(Integer.MAX_VALUE);
        try {
            Thread.currentThread().sleep(1500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        if (iter==0) {
            corrX1.setDisable(true);
            oMoveX1.setDisable(false);
            corrX2.setDisable(true);
            oMoveX2.setDisable(true);
            corrX3.setDisable(true);
            oMoveX3.setDisable(true);
            oX11MinF.setText("15.54");
            oX11MaxF.setText("59.03");
            oX12MinF.setText("16.19");
            oX12MaxF.setText("41.24");
//            oX13MinF.setText("21.65");
//            oX13MaxF.setText("47.12");
            sb.append("\nDone\n\nLimits correction (D+-) for X2 is necessary");
        } else if (iter==1){
            corrX1.setDisable(true);
            oMoveX1.setDisable(false);
            corrX2.setDisable(true);
            oMoveX2.setDisable(true);
            corrX3.setDisable(true);
            oMoveX3.setDisable(true);
            oX11MinF.setText("31.21");
            oX11MaxF.setText("56.02");
            oX12MinF.setText("18.34");
            oX12MaxF.setText("34.32");
//            oX13MinF.setText("25.41");
//            oX13MaxF.setText("44.28");
            sb.append("\nDone\n\nLimits correction (D+-) for X2 is necessary");
        } else if (iter==2){
            corrX1.setDisable(true);
            oMoveX1.setDisable(false);
            corrX2.setDisable(true);
            oMoveX2.setDisable(true);
            corrX3.setDisable(true);
            oMoveX3.setDisable(true);
            oX11MinF.setText("34.81");
            oX11MaxF.setText("55.72");
            oX12MinF.setText("19.78");
            oX12MaxF.setText("30.13");
//            oX13MinF.setText("29.86");
//            oX13MaxF.setText("40.23");
            sb.append("\nDone\n\n(D+-) enclosed in (D0) - Pareto domain found");
            con.setText(sb.toString());
            con.positionCaret(Integer.MAX_VALUE);
        }

        textArea.setText(sb.toString());
        textArea.positionCaret(Integer.MAX_VALUE);
    }

    @FXML
    public void moveX1(){
        if (iter==0) {
            corrX1.setDisable(true);
            oMoveX1.setDisable(true);
            corrX2.setDisable(false);
            oMoveX2.setDisable(true);
            corrX3.setDisable(true);
            oMoveX3.setDisable(true);
        } else if (iter==1){
            corrX1.setDisable(true);
            oMoveX1.setDisable(true);
            corrX2.setDisable(false);
            oMoveX2.setDisable(true);
            corrX3.setDisable(true);
            oMoveX3.setDisable(true);
        } else if (iter==2){
            corrX1.setDisable(true);
            oMoveX1.setDisable(true);
            corrX2.setDisable(true);
            oMoveX2.setDisable(true);
            corrX3.setDisable(true);
            oMoveX3.setDisable(true);
        }
        oX11Min.setText(oX11MinF.getText());
        oX12Min.setText(oX12MinF.getText());
//        oX13Min.setText(oX13MinF.getText());

        oX11Max.setText(oX11MaxF.getText());
        oX12Max.setText(oX12MaxF.getText());
//        oX13Max.setText(oX13MaxF.getText());

    }
    @FXML
    public void corrX2(){
        sb.append("\n\nX2 correction");
        textArea.setText(sb.toString());
        textArea.positionCaret(Integer.MAX_VALUE);
        try {
            Thread.currentThread().sleep(1500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        if (iter==0) {
            corrX1.setDisable(true);
            oMoveX1.setDisable(true);
            corrX2.setDisable(true);
            oMoveX2.setDisable(false);
            corrX3.setDisable(true);
            oMoveX3.setDisable(true);
            oX21MinF.setText("12.44");
            oX21MaxF.setText("27.43");
            oX22MinF.setText("1.02");
            oX22MaxF.setText("8.24");
        } else if (iter==1){
            corrX1.setDisable(true);
            oMoveX1.setDisable(true);
            corrX2.setDisable(true);
            oMoveX2.setDisable(false);
            corrX3.setDisable(true);
            oMoveX3.setDisable(true);
            oX21MinF.setText("14.44");
            oX21MaxF.setText("21.43");
            oX22MinF.setText("2.92");
            oX22MaxF.setText("5.53");
        }
        sb.append("\nDone\n\nLimits correction (D+-) for X3 is necessary");

        textArea.setText(sb.toString());
        textArea.positionCaret(Integer.MAX_VALUE);
    }
    @FXML
    public void moveX2(){
        if (iter==0) {
            corrX1.setDisable(true);
            oMoveX1.setDisable(true);
            corrX2.setDisable(true);
            oMoveX2.setDisable(true);
            corrX3.setDisable(false);
            oMoveX3.setDisable(true);
        } else if (iter==1){
            corrX1.setDisable(true);
            oMoveX1.setDisable(true);
            corrX2.setDisable(true);
            oMoveX2.setDisable(true);
            corrX3.setDisable(false);
            oMoveX3.setDisable(true);
        }

        oX21Min.setText(oX21MinF.getText());
        oX22Min.setText(oX22MinF.getText());

        oX21Max.setText(oX21MaxF.getText());
        oX22Max.setText(oX22MaxF.getText());
    }
    @FXML
    public void corrX3(){
        sb.append("\n\nX3 correction");
        textArea.setText(sb.toString());
        textArea.positionCaret(Integer.MAX_VALUE);
        try {
            Thread.currentThread().sleep(1500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        if (iter==0) {
            corrX1.setDisable(true);
            oMoveX1.setDisable(true);
            corrX2.setDisable(true);
            oMoveX2.setDisable(true);
            corrX3.setDisable(true);
            oMoveX3.setDisable(false);
            oX31MinF.setText("13.14");
            oX31MaxF.setText("25.12");
            oX32MinF.setText("4.72");
            oX32MaxF.setText("14.61");
        } else if (iter==1){
            corrX1.setDisable(true);
            oMoveX1.setDisable(true);
            corrX2.setDisable(true);
            oMoveX2.setDisable(true);
            corrX3.setDisable(true);
            oMoveX3.setDisable(false);
            oX31MinF.setText("14.67");
            oX31MaxF.setText("20.13");
            oX32MinF.setText("9.72");
            oX32MaxF.setText("12.11");
        }
        sb.append("\nDone\n\nLimits correction (D+-) for X1 is necessary");

        textArea.setText(sb.toString());
        textArea.positionCaret(Integer.MAX_VALUE);
    }

    @FXML
    public void moveX3(){
        if (iter==0) {
            corrX1.setDisable(false);
            oMoveX1.setDisable(true);
            corrX2.setDisable(true);
            oMoveX2.setDisable(true);
            corrX3.setDisable(true);
            oMoveX3.setDisable(true);
        } else if (iter==1){
            corrX1.setDisable(false);
            oMoveX1.setDisable(true);
            corrX2.setDisable(true);
            oMoveX2.setDisable(true);
            corrX3.setDisable(true);
            oMoveX3.setDisable(true);
        }

        oX31Min.setText(oX31MinF.getText());
        oX32Min.setText(oX32MinF.getText());

        oX31Max.setText(oX31MaxF.getText());
        oX32Max.setText(oX32MaxF.getText());
        iter++;
    }

}
