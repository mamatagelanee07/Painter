package com.gelu.painter.database;

import com.gelu.painter.model.PainterImages;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import java.util.List;
import androidx.room.TypeConverter;

public class Converters {

    @TypeConverter // note this annotation
    public String fromPainterValueList(List<PainterImages> optionValues) {
        if (optionValues == null) {
            return (null);
        }
        Gson gson = new Gson();
        Type type = new TypeToken<List<PainterImages>>() {
        }.getType();
        String json = gson.toJson(optionValues, type);
        return json;
    }

    @TypeConverter // note this annotation
    public List<PainterImages> toPainterValueList(String optionValuesString) {
        if (optionValuesString == null) {
            return (null);
        }
        Gson gson = new Gson();
        Type type = new TypeToken<List<Painter>>() {
        }.getType();
        List<PainterImages> painterList = gson.fromJson(optionValuesString, type);
        return painterList;
    }

}
