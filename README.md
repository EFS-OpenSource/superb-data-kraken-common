# sdk-common package


[![License](https://img.shields.io/badge/License-Apache%202.0-blue.svg)](https://opensource.org/licenses/Apache-2.0)
![Java Version](https://img.shields.io/badge/Java-17-blue)

- [About](#about)
- [Getting Started](#getting-started)
    - [Prerequisites](#prerequisites)
    - [Setup](#setup)
- [Usage](#usage)
- [Deployment](#deployment)
- [Built With](#built-with)
- [Contributing](#contributing)
- [Changelog](#changelog)

---


## About


The `sdk-common` package is a utility package providing *domain model* classes and DTOs for services of the *Superb Data Kraken Platform (SDK)*.

For a more detailed understanding of the broader context of the platform this package is used in, refer to
the [architecture documentation](link-to-architecture-documentation). (#TODO)

For a comprehensive guide on installing the **SDK**, refer to the [installation instructions](link-to-install-instructions). (#TODO)


## Getting Started


Follow the instructions below to set up a local copy of the project for development and testing.


### Prerequisites

- jdk >= 17
- Maven 3.6.x (if you're not using the Maven wrapper)

### Setup


To set up your local environment for development and testing, follow these steps:

1. Clone the repository:
   ```bash
   git clone https://github.com/EFS-OpenSource/superb-data-kraken-common.git
   cd superb-data-kraken-common
1. Build the project and install the package to your local Maven repository:
   ```bash
   ./mvnw clean install

## Usage


To include this module in your project, simply add the following dependency declaration to the <dependencies> section of your pom.xml:

```
<dependency>
   <groupId>com.efs.sdk</groupId>
   <artifactId>sdk-common</artifactId>
   <version>${version}</version>
</dependency>
```

## Built With


Links to tools used for building. Example:

- Maven v3.6.3 (see this [Link](https://maven.apache.org/))

## Contributing


See the [Contribution Guide](./CONTRIBUTING.md).


## Changelog


See the [Changelog](./CHANGELOG.md).
