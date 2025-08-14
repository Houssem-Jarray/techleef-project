FROM ubuntu:22.04

ENV DEBIAN_FRONTEND=noninteractive
ENV TZ=Etc/UTC

RUN apt-get update && apt-get install -y --no-install-recommends \
    build-essential \
    chrpath \
    cpio \
    debianutils \
    diffstat \
    file \
    gawk \
    gcc  \ 
    iputils-ping \
    libacl1 \
    liblz4-tool \
    python3-git \
    python3-jinja2 \
    python3-pexpect \
    python3-subunit \
    socat \
    texinfo \
    unzip \
    xz-utils \
    zstd \
    bison \
    flex \
    libssl-dev \
    libgnutls28-dev \
    pkg-config \
    libncurses5-dev \
    python3 \
    python3-pip \
    git \
    ca-certificates \
    wget \
    && rm -rf /var/lib/apt/lists/*

RUN apt-get update && apt-get install -y locales \
    && locale-gen en_US.UTF-8 \
    && update-locale LANG=en_US.UTF-8
ENV LANG=en_US.UTF-8
ENV LANGUAGE=en_US:en
ENV LC_ALL=en_US.UTF-8


# Install kas
RUN pip3 install --no-cache-dir kas

RUN git config --global --add safe.directory /build/kas/poky \
    && git config --global --add safe.directory /build/kas/meta-raspberrypi


WORKDIR /build
CMD ["/bin/bash"]
