package com.bytatech.ayoos.client.patient.api;

import org.springframework.cloud.openfeign.FeignClient;
import com.bytatech.ayoos.client.patient.ClientConfiguration;

@FeignClient(name="${patient.name:patient}", url="${patient.url:35.238.35.19:8099/}", configuration = ClientConfiguration.class)
public interface DmsRecordResourceApiClient extends DmsRecordResourceApi {
}