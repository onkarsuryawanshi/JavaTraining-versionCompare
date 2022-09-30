package services;

import model.Server;

import java.util.*;
import java.util.stream.Collectors;

public class TestService {
    public SortedSet<String> sortedVersions(List<String> versions) {
        SortedSet<String> sortedVersions = new TreeSet<>(/*new SoftwareVersionComparator()*/);
        for (String version : versions) {
            sortedVersions.add(version);
        }
        return sortedVersions;
    }
}
class SoftwareVersionComparator implements Comparator<String> {
    @Override
    public int compare(String version, String otherVersion) {
        return normalizedVersion(version).compareTo(normalizedVersion(otherVersion));
    }
    private String normalizedVersion(String version) {
        return Arrays.stream(version.split("\\."))
                .map(v -> String.format("%2s", v).replace(' ', '0'))
                .collect(Collectors.joining("."));
    }
}