package com.tts.mapsapp;

import java.util.List;

import lombok.Data;

@Data
public class ReverseGeocodingResponse {
    private List<ReverseGeocoding> results;
}