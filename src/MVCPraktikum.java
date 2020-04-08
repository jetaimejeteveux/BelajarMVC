public class MVCPraktikum {

    ViewPraktikum viewPraktikum = new ViewPraktikum();
    ModelPraktikum modelPraktikum = new ModelPraktikum();
    ControllerPraktikum controllerPraktikum = new ControllerPraktikum(modelPraktikum, viewPraktikum);
}
