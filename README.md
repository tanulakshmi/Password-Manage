# Phishing Detection Tool

## Overview

The Phishing Detection Tool is a Java-based application that utilizes machine learning techniques to classify URLs as phishing or legitimate. The tool analyzes various features of the URLs to determine their safety, helping users avoid potential online threats.

## Features

- **URL Classification**: Classifies URLs as phishing or legitimate based on extracted features.
- **Feature Extraction**: Analyzes URL characteristics such as length, presence of special characters, and use of HTTPS.
- **Machine Learning Model**: Trained using Weka with logistic regression for effective classification.
- **User -Friendly GUI**: Simple interface built with Java Swing for easy interaction.
- **Logging**: Tracks user inputs and model predictions for better debugging and analysis.

## Technologies Used

- **Java**: Programming language used for development.
- **Weka**: Machine learning library for model training and evaluation.
- **Java Swing**: GUI toolkit for building the user interface.
- **Apache Commons CSV**: (Optional) For reading CSV files if you choose to use CSV format for your dataset.

## Installation

1. **Clone the Repository**:
   ```bash
   git clone https://github.com/yourusername/phishing-detection-tool.git
   cd phishing-detection-tool
