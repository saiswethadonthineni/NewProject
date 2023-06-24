package com.example.NewProject;

import com.example.NewProject.controller.AddContoller;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.ui.Model;

import static org.mockito.Mockito.mock;

@ExtendWith(MockitoExtension.class)
public class ControllerTests {

    @InjectMocks
    private AddContoller addContoller;
    @Mock
    Model model;

    @Test
    void sum(){
        int a=1;
        int b=2;
        Model m= mock(Model.class);
        String s=addContoller.sum(a,b,m);
        Assertions.assertEquals("sumResult",s);


    }

    @Test
    void sumForm(){
      String res=
        addContoller.sumForm();
      Assertions.assertEquals("sumForm",res);
    }
}
