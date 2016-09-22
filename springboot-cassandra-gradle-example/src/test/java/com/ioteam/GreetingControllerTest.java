package com.ioteam;

import com.nitorcreations.junit.runners.NestedRunner;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

/**
 * @author Moussi Aymen
 */
@RunWith(NestedRunner.class)
public class GreetingControllerTest {

    private MockMvc mockMvc;

    @Before
    public void setUp() {
        mockMvc = MockMvcBuilders.standaloneSetup(new GreetingControllerTest())
                .build();
    }

    public class RenderHelloWorldView {

        @Test
        public void shouldReturnResponseStatusOk() throws Exception {
        }

        @Test
        public void shouldRenderTheHelloWorldView() throws Exception {
            /*mockMvc.perform(get("/"))
                    .andExpect(view().name("index"));*/

        }
    }
}