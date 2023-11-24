package com.snob.universityconsole.model;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public enum Degree {
    ASSISTANT("Assistant"),
    ASSOCIATE_PROFESSOR("Associate professor"),
    PROFESSOR("Professor");
    private final String displayName;
    @Override
    public String toString() {
        return displayName;
    }
}
