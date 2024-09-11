package fake.vendedora.carros.controller;

import fake.vendedora.carros.model.GSonVeiculoResponse;
import fake.vendedora.carros.model.Veiculo;
import fake.vendedora.carros.model.VeiculoXml;
import fake.vendedora.carros.model.XmlVeiculoResponse;
import fake.vendedora.carros.service.VeiculoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class VeiculoController {

    @Autowired
    VeiculoService veiculoService;

    @GetMapping(value="/xml", produces = MediaType.APPLICATION_XML_VALUE)
    public ResponseEntity<XmlVeiculoResponse> sendXml() {
        try {
            List<VeiculoXml> veiculosXml = veiculoService.getRngVeiculosXml();
            XmlVeiculoResponse response = new XmlVeiculoResponse(veiculosXml);
            return ResponseEntity.ok(response);
        } catch (Exception e) {
            return ResponseEntity.internalServerError().build();
        }
    }

    @GetMapping(value="/json", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<GSonVeiculoResponse> sendgson() {
        try {
            List<Veiculo> veiculos = veiculoService.getRngVeiculos();
            GSonVeiculoResponse response = new GSonVeiculoResponse(veiculos);
            return ResponseEntity.ok(response);
        } catch (Exception e) {
            return ResponseEntity.internalServerError().build();
        }
    }

}
