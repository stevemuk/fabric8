package io.fabric8.forge.rest.git.dto;

import java.util.Date;

/**
 * Represents information about a commit log or history
 */
public class CommitInfo extends GitDTOSupport {
    private final String sha;
    private final String author;
    private final String name;
    private final String email;
    private final String avatarUrl;
    private final Date date;
    private final boolean merge;
    private final String shortMessage;

    public CommitInfo(String sha, String author, String name, String email, String avatarUrl, Date date, boolean merge, String shortMessage) {
        this.sha = sha;
        this.author = author;
        this.name = name;
        this.email = email;
        this.avatarUrl = avatarUrl;
        this.date = date;
        this.merge = merge;
        this.shortMessage = shortMessage;
    }

    @Override
    public String toString() {
        return "CommitInfo(sha " + sha + " author " + author + " date " + date + " merge " + merge + " " + shortMessage + ")";
    }

    public String getAvatarUrl() {
        return avatarUrl;
    }

    public String getEmail() {
        return email;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public Date getDate() {
        return date;
    }

    public boolean isMerge() {
        return merge;
    }

    public String getSha() {
        return sha;
    }

    public String getShortMessage() {
        return shortMessage;
    }
}
