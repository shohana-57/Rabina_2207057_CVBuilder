package com.example.rabina_2207057_cvbuilder;

import javafx.application.Platform;

import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.function.Consumer;

public class CVRepository {
    private final ExecutorService executor = Executors.newSingleThreadExecutor();
    public void getAllAsync(Consumer<List<CVNode>> onSuccess, Consumer<Throwable> onError) {
        executor.submit(() ->{
            try {

                List<CVNode> list = DatabaseHelper.getAllSamples();
                Platform.runLater(() -> onSuccess.accept(list));
            } catch (Throwable ex) {
                Platform.runLater(() -> onError.accept(ex));
            }
        });

    }

    public void updateAsync(CVNode node, Runnable onSuccess, Consumer<Throwable> onError) {
        executor.submit(() -> {
            try {
                DatabaseHelper.updateSample(node);
                Platform.runLater(onSuccess);
            } catch (Throwable ex) {
                Platform.runLater(() -> onError.accept(ex));
            }
        });
    }

    public void deleteAsync(int id, Runnable onSuccess, Consumer<Throwable> onError) {
        executor.submit(() -> {
            try {
                DatabaseHelper.deleteSample(id);
                Platform.runLater(onSuccess);
            } catch (Throwable ex) {
                Platform.runLater(() -> onError.accept(ex));
            }
        });

    }
}
