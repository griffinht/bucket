package net.stzups.bucket.api;

public interface Repository {
    PackageMeta getPackageMetaByName(String name);
    Package getPackage(PackageMeta packageMeta, Version version);
}
