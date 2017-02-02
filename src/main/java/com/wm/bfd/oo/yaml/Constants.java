package com.wm.bfd.oo.yaml;

public class Constants {

  /**
   * Global config.
   */
  public static final String TEMPLATE = "/test.yaml";
  public static final String IP_OUTPUT = "json";
  public static final String DESCRIPTION = "GENERATED BY BOO. DO NOT MODIFY MANUALLY!";
  public static final String UPDATE_DESCRIPTION = "BOO updated assembly";
  public static final String CREATE_DESCRIPTION = "BOO created new assembly";
  public static final String CLEANUP_DESCRIPTION = "BOO cleaned up instance";
  public static final String PLATFORMS = "platforms";
  public static final String CLOUDS = "clouds";
  public static final String EXTRACT = "extract";
  public static final String VARIABLES = "variables";
  public static final String DESCRIPTIONS = "description";
  public static final String YAML_ERROR = "The template file not found or has wrong format!";
  public static final String AVAILABILITY = "availability";
  public static final String GLOBAL_DNS = "global_dns";
  public static final String SUBDOMAIN = "subdomain";
  public static final String ENV_NAME = "environment_name";
  public static final String TRUE = "true";
  public static final String PRIVATE_IP = "private_ip";
  public static final String ACTIVE = "active";
  public static final String SIZE = "size";
  public static final String CINAME = "ciName";
  public static final String OFFLINE = "offline";
  public static final String AUTHO_KEYS = "authorized_keys";
  public static final String CIATTRPROPS = "ciAttrProps";
  public static final String OWNER = "owner";
  // public static final String ASSEMBLY_PREFIX = "CUBEBOO-"; // Magic string.
  public static final String ASSEMBLY_NAME_TOO_LONG = "Assembly name cannot be more than 32 characters long. Please fix your assembly name in YAML.";

  /**
   * Exit code.
   */
  public static final int EXIT_NORMAL = 0; // Command executed successfully
  public static final int EXIT_PARSE_ERROR = 1; // Exception when paring YAML
  public static final int EXIT_YAML_NOT_FOUND = 2; // YAML file not found
  public static final int EXIT_ASSEMBLY_NOT_FOUND = 3; // Assembly not found
  public static final int EXIT_WRONG_PRAMETER = 4; // Command line has wrong parameters
  public static final int EXIT_BOO = 5; // BOO internal error
  public static final int EXIT_CLIENT = 6; // Exception from OneOps client APIs
  public static final int EXIT_UNKOWN = 7; // Unknown error
  public static final int Exit_NOT_COMPLETE = 8;// Procedure was not completed

  /**
   * Customize config.
   */
  public static final String IPTERMINATOR1 = "[";
  public static final String IPTERMINATOR2 = "]";
  public static final String NUMTERMINATOR1 = "{";
  public static final String NUMTERMINATOR2 = "}";
  public static final String DEDAULT_IPSPLIT = ",";
  public static final char DOLLAR = '$';
  public static final char SLASH = '/';
  public static final char DOT = '.';
  public static final char DASH = '-';
  public static final String DOUBLE_PERIOD = "..";
  public static final String ATTACHMENTS = "attachments";

  public static final String BFD_TOOL = "The tool is managed by BFD team.";
  public static final String NO_AVAILABILITY = "You don't set the availability, please check your yaml config.";
  public static final String ASSEMBLY_PREFIX_ERROR = "The prefix of assembly cannot be empty!";
  // Components
  public static final String USER = "user";

  // Operate
  public static final String DEPLOYMENT_ID = "deploymentId";
  public static final String DEPLOYMENT_STATE = "deploymentState";

  // Output during deployment
  public static final String DESTROY_ASSEMBLY = "Destroyed assembly %s!";
  public static final String PLATFORM_EXISTING = "Platform exist, skip create platform %s.";
  public static final String CREATING_ASSEMBLY = "Auto generate assembly name turned on. Creating assembly %s ...";
  public static final String CREATING_PLATFORM = "Creating platform %s ...";
  public static final String DESTROY_PLATFORM = "Destroying platform %s ...";
  public static final String CONFIG_FILE = "Configuration file: %s";
  public static final String CONFIG_DIR = "Configuration dir: %s";
  public static final String WORKING_FILE = "Working file: %s";

  public static final String CREATE_COMPONENTS = "Creating component %s for %s ...";
  public static final String UPDATE_COMPONENTS = "Updating component %s for %s ...";
  public static final String UPDATE_COMPONENTS2 = "Updating component %s %s for %s ...";

  public static final String CREATING_PLATFORM_SUCCEED = "Created platform %s.";
  public static final String START_DEPLOYMENT = "Starting the deployment now.";
  public static final String CREATE_WITHOUT_DEPLOYMENT = "Created/updated assembly without deployments.";
  public static final String DEPLOYMENT_RUNNING = "Deployment is running ...";
  public static final String DEPLOYMENT_FAILED = "Deploy failed! %s";
  public static final String NO_NEED_DEPLOY = "NO deployment needed!";
  public static final String ACTIVE_DEPLOYMENT_EXISTING = "An active deployment has been running in the same environment, quit!";
  public static final String FAIL_DEPLOYMENT_EXISTING = "A failed deployment has been running in the same environment, quit!";
  public static final String CREATE_ENV = "Creating the environment %s.";
  public static final String UPDATE_ENV = "Updating the environment %s.";
  public static final String ENV_EXISTING = "Environment exist, skip create environment %s.";
  public static final String COMPUTE_SIZE = "Updating the compute size in %s - %s";
  public static final String NEED_ANOTHER_CLEANUP =
      "A deployment has been started to remove active nodes. Please execute this command again once the deployment is complete to finish deleting remaining elements.";
  public static final String NOTFOUND_ERROR = "Cannot find assembly %s! %n";
  public static final String NO_DEPLOYMENT = "404 Not Found";
  public static final String NO_ENVIRONMENT = "No such environment";
  public static final String SUCCEED = "Succeed!";
  public static final String PROCEDURE_NOT_COMPLETE = "Procedure did not complete";
  public static final String PROCEDURE_RUNNING = "Procedure is running ...";

  // Debug
  public static final String ENV_NOT_EXISTING = "The environment %s is not exist! %s";



}
