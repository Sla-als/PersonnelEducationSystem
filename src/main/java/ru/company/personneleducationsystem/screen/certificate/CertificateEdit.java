package ru.company.personneleducationsystem.screen.certificate;

import io.jmix.ui.screen.*;
import ru.company.personneleducationsystem.entity.Certificate;

@UiController("Certificate.edit")
@UiDescriptor("certificate-edit.xml")
@EditedEntityContainer("certificateDc")
public class CertificateEdit extends StandardEditor<Certificate> {
}