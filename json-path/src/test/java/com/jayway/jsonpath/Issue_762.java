package com.jayway.jsonpath;

import org.junit.Test;


/**
 * test for issue 782
 */

public class Issue_762 {
    @Test
    public void testParseJsonValue(){
        assert(JsonPath.parse(5).jsonString().equals("5"));
        assert(JsonPath.parse(5.0).jsonString().equals("5.0"));
        assert(JsonPath.parse(true).jsonString().equals("true"));
        assert(JsonPath.parse(false).jsonString().equals("false"));
    }
}
