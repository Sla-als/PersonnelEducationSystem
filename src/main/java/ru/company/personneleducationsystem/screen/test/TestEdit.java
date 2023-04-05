package ru.company.personneleducationsystem.screen.test;

import io.jmix.ui.screen.*;
import ru.company.personneleducationsystem.entity.Test;

@UiController("Test.edit")
@UiDescriptor("test-edit.xml")
@EditedEntityContainer("testDc")
public class TestEdit extends StandardEditor<Test> {
}