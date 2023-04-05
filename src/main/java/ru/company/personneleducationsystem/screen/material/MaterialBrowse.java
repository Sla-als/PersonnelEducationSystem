package ru.company.personneleducationsystem.screen.material;

import io.jmix.ui.screen.*;
import ru.company.personneleducationsystem.entity.Material;

@UiController("Material.browse")
@UiDescriptor("material-browse.xml")
@LookupComponent("materialsTable")
public class MaterialBrowse extends StandardLookup<Material> {
}