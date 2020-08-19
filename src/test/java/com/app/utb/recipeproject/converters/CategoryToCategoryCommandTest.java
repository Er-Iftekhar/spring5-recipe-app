package com.app.utb.recipeproject.converters;

import com.app.utb.recipeproject.commands.CategoryCommand;
import com.app.utb.recipeproject.domain.Category;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CategoryToCategoryCommandTest {

    public static final Long ID_VALUE=new Long(1L);
    public static final String DESCRIPTION="descript";

    CategoryToCategoryCommand converter;

    @Before
    public void setUp() throws Exception {
        converter=new CategoryToCategoryCommand();
    }

    @Test
    public void testNullObject(){
        assertNull(converter.convert(null));
    }

    @Test
    public void testEmptyObject(){
        assertNotNull(converter.convert(new Category()));
    }

    @Test
    public void convert() {

        //given
        Category category=new Category();
        category.setId(ID_VALUE);
        category.setDescription(DESCRIPTION);

        //when
        CategoryCommand categoryCommand=converter.convert(category);

        //then
        assertEquals(ID_VALUE, categoryCommand.getId());
        assertEquals(DESCRIPTION, categoryCommand.getDescription());
    }
}