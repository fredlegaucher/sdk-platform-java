/*
 * Copyright 2020 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/api/context.proto

package com.google.api;

public interface ContextRuleOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.api.ContextRule)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Selects the methods to which this rule applies.
   * Refer to [selector][google.api.DocumentationRule.selector] for syntax
   * details.
   * </pre>
   *
   * <code>string selector = 1;</code>
   *
   * @return The selector.
   */
  java.lang.String getSelector();
  /**
   *
   *
   * <pre>
   * Selects the methods to which this rule applies.
   * Refer to [selector][google.api.DocumentationRule.selector] for syntax
   * details.
   * </pre>
   *
   * <code>string selector = 1;</code>
   *
   * @return The bytes for selector.
   */
  com.google.protobuf.ByteString getSelectorBytes();

  /**
   *
   *
   * <pre>
   * A list of full type names of requested contexts.
   * </pre>
   *
   * <code>repeated string requested = 2;</code>
   *
   * @return A list containing the requested.
   */
  java.util.List<java.lang.String> getRequestedList();
  /**
   *
   *
   * <pre>
   * A list of full type names of requested contexts.
   * </pre>
   *
   * <code>repeated string requested = 2;</code>
   *
   * @return The count of requested.
   */
  int getRequestedCount();
  /**
   *
   *
   * <pre>
   * A list of full type names of requested contexts.
   * </pre>
   *
   * <code>repeated string requested = 2;</code>
   *
   * @param index The index of the element to return.
   * @return The requested at the given index.
   */
  java.lang.String getRequested(int index);
  /**
   *
   *
   * <pre>
   * A list of full type names of requested contexts.
   * </pre>
   *
   * <code>repeated string requested = 2;</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the requested at the given index.
   */
  com.google.protobuf.ByteString getRequestedBytes(int index);

  /**
   *
   *
   * <pre>
   * A list of full type names of provided contexts.
   * </pre>
   *
   * <code>repeated string provided = 3;</code>
   *
   * @return A list containing the provided.
   */
  java.util.List<java.lang.String> getProvidedList();
  /**
   *
   *
   * <pre>
   * A list of full type names of provided contexts.
   * </pre>
   *
   * <code>repeated string provided = 3;</code>
   *
   * @return The count of provided.
   */
  int getProvidedCount();
  /**
   *
   *
   * <pre>
   * A list of full type names of provided contexts.
   * </pre>
   *
   * <code>repeated string provided = 3;</code>
   *
   * @param index The index of the element to return.
   * @return The provided at the given index.
   */
  java.lang.String getProvided(int index);
  /**
   *
   *
   * <pre>
   * A list of full type names of provided contexts.
   * </pre>
   *
   * <code>repeated string provided = 3;</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the provided at the given index.
   */
  com.google.protobuf.ByteString getProvidedBytes(int index);

  /**
   *
   *
   * <pre>
   * A list of full type names or extension IDs of extensions allowed in grpc
   * side channel from client to backend.
   * </pre>
   *
   * <code>repeated string allowed_request_extensions = 4;</code>
   *
   * @return A list containing the allowedRequestExtensions.
   */
  java.util.List<java.lang.String> getAllowedRequestExtensionsList();
  /**
   *
   *
   * <pre>
   * A list of full type names or extension IDs of extensions allowed in grpc
   * side channel from client to backend.
   * </pre>
   *
   * <code>repeated string allowed_request_extensions = 4;</code>
   *
   * @return The count of allowedRequestExtensions.
   */
  int getAllowedRequestExtensionsCount();
  /**
   *
   *
   * <pre>
   * A list of full type names or extension IDs of extensions allowed in grpc
   * side channel from client to backend.
   * </pre>
   *
   * <code>repeated string allowed_request_extensions = 4;</code>
   *
   * @param index The index of the element to return.
   * @return The allowedRequestExtensions at the given index.
   */
  java.lang.String getAllowedRequestExtensions(int index);
  /**
   *
   *
   * <pre>
   * A list of full type names or extension IDs of extensions allowed in grpc
   * side channel from client to backend.
   * </pre>
   *
   * <code>repeated string allowed_request_extensions = 4;</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the allowedRequestExtensions at the given index.
   */
  com.google.protobuf.ByteString getAllowedRequestExtensionsBytes(int index);

  /**
   *
   *
   * <pre>
   * A list of full type names or extension IDs of extensions allowed in grpc
   * side channel from backend to client.
   * </pre>
   *
   * <code>repeated string allowed_response_extensions = 5;</code>
   *
   * @return A list containing the allowedResponseExtensions.
   */
  java.util.List<java.lang.String> getAllowedResponseExtensionsList();
  /**
   *
   *
   * <pre>
   * A list of full type names or extension IDs of extensions allowed in grpc
   * side channel from backend to client.
   * </pre>
   *
   * <code>repeated string allowed_response_extensions = 5;</code>
   *
   * @return The count of allowedResponseExtensions.
   */
  int getAllowedResponseExtensionsCount();
  /**
   *
   *
   * <pre>
   * A list of full type names or extension IDs of extensions allowed in grpc
   * side channel from backend to client.
   * </pre>
   *
   * <code>repeated string allowed_response_extensions = 5;</code>
   *
   * @param index The index of the element to return.
   * @return The allowedResponseExtensions at the given index.
   */
  java.lang.String getAllowedResponseExtensions(int index);
  /**
   *
   *
   * <pre>
   * A list of full type names or extension IDs of extensions allowed in grpc
   * side channel from backend to client.
   * </pre>
   *
   * <code>repeated string allowed_response_extensions = 5;</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the allowedResponseExtensions at the given index.
   */
  com.google.protobuf.ByteString getAllowedResponseExtensionsBytes(int index);
}
