/*
 * Copyright (C) Gleidson Neves da Silveira
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Menu;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.SVGPath;
import javafx.stage.Stage;
import vulembere.vulembereGUI;

/**
 * @author Gleidson Neves da Silveira | gleidisonmt@gmail.com Create on
 * 23/09/2018 Version 1.0
 */
public class Test extends Application {

    @Override
    public void start(Stage stage) throws Exception {

        VBox content = new VBox();
        content.setAlignment(Pos.CENTER);
        content.setPrefSize(400, 400);
        vulembereGUI window = new vulembereGUI();
        Button btn = new Button("Action");
        btn.setOnMouseClicked(event -> {
            window.floatActions();
        });

        content.getChildren().add(btn);
        window.setContent(content);

        window.setTitle("Application");

        Menu btn_ico = new Menu();
        btn_ico.setStyle("-fx-background-color : transparent;");
        btn_ico.show();
        btn_ico.getItems().clear();

//        System.out.println(btn_ico.fire());
        SVGPath icon = new SVGPath();
        icon.setId("icon");
        icon.setContent("M3 13h8V3H3v10zm0 8h8v-6H3v6zm10 0h8V11h-8v10zm0-18v6h8V3h-8z");
        btn_ico.setGraphic(icon);
        icon.setFill(Color.web("#999"));
        icon.setOnMouseClicked(event -> System.out.println("teste"));

        window.addMenu(btn_ico);
        window.fullBody();
        window.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
