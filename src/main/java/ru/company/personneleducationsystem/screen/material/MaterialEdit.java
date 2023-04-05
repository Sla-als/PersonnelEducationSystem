package ru.company.personneleducationsystem.screen.material;

import io.jmix.ui.screen.*;
import ru.company.personneleducationsystem.entity.Material;

@UiController("Material.edit")
@UiDescriptor("material-edit.xml")
@EditedEntityContainer("materialDc")
public class MaterialEdit extends StandardEditor<Material> {
}