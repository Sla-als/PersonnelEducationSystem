package ru.company.personneleducationsystem.screen.certificate;

import io.jmix.ui.screen.*;
import ru.company.personneleducationsystem.entity.Certificate;

@UiController("Certificate.browse")
@UiDescriptor("certificate-browse.xml")
@LookupComponent("certificatesTable")
public class CertificateBrowse extends StandardLookup<Certificate> {
}