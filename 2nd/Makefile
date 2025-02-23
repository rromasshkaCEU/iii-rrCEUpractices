# Makefile for Monte Carlo Pi Estimation

# Variables
SRC_DIR := src
BIN_DIR := bin
DOC_DIR := docs
JAVAC := javac
JAVADOC := javadoc
JAVA_FILES := $(SRC_DIR)/Main.java
CLASS_FILES := $(JAVA_FILES:$(SRC_DIR)/%.java=$(BIN_DIR)/%.class)
MAIN_CLASS := Main

# Default target to build and run the project
all: compile run

# Compile Java files
compile: $(CLASS_FILES)

$(BIN_DIR)/%.class: $(SRC_DIR)/%.java
	@mkdir -p $(BIN_DIR)
	$(JAVAC) -d $(BIN_DIR) $<

# Generate Javadocs
javadoc:
	@mkdir -p $(DOC_DIR)
	$(JAVADOC) -d $(DOC_DIR) $(JAVA_FILES)

# Clean up build files
clean:
	rm -rf $(BIN_DIR) $(DOC_DIR)

# Run the project
run:
	java -cp $(BIN_DIR) $(MAIN_CLASS)

